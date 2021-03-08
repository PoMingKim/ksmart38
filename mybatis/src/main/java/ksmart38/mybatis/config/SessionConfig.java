package ksmart38.mybatis.config;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import ksmart38.mybatis.dao.MemberMapper;

@Component
public class SessionConfig implements HttpSessionListener, HttpSessionAttributeListener, HttpSessionBindingListener {

	
	private static final Logger log = LoggerFactory.getLogger(SessionConfig.class);
	
	private static final Map<String, HttpSession> sessionList = new HashMap<>();

	private final MemberMapper memberMapper;
	
	public SessionConfig(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}
	
	@Override
    public void sessionCreated(HttpSessionEvent hse) {
		
		log.info("sessionList -->{}", sessionList.toString());
		log.info("sessionId -->{}", hse.getSession().getId());
		
		
		sessionList.put(hse.getSession().getId(), hse.getSession());  //getId메소드는 해당 세션의 고유 키값
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent hse) {
    	sessionList.get(hse.getSession().getId()).invalidate();  
    	sessionList.remove(hse.getSession().getId());	
    	log.info("sessionList -->{}", sessionList.toString());
    }
    
    //해당 메소드는 로그인 하는 곳에서 호출하는 메소드 이다.
    public synchronized static String loginSessionChecker(String compareId){
        String result = "";
        for( String key : sessionList.keySet() ){
            HttpSession value = sessionList.get(key);
            if(value != null &&  value.getAttribute("SID") != null && value.getAttribute("SID").toString().equals(compareId) ){
            	log.info(value.getAttribute("SID").toString());
                result =  key.toString();
            }
        }
        removeSessionForDoubleLogin(result);
        return result;
    }
    private static boolean removeSessionForDoubleLogin(String userId){    	
        if(userId != null && !"".equals(userId)){
        	sessionList.get(userId).invalidate();
        	sessionList.remove(userId);    		
        }
    	return true;
    }    
}
