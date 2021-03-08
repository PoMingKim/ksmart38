package ksmart38.mybatis.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart38.mybatis.service.MemberService;

@Controller
public class CommonController {
	
	private final MemberService memberService;
	
	public CommonController(MemberService memberService) {
		this.memberService = memberService;
	}

	@GetMapping("/")
	public String main() {
		return "main";
	}
	
	@GetMapping("/loginHistory")
	public String loginHistory(Model model
							  ,@RequestParam(value="currentPage", required = false, defaultValue = "1") int currentPage) {
		
		Map<String, Object> resultMap = memberService.getLoginHistory(currentPage);

		
		
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("lastPage", resultMap.get("lastPage"));
		model.addAttribute("loginHistoryList", resultMap.get("loginHistory"));
		
		return "login/loginHistory";
	}
}
