package ksmart38.mybatis.encryption;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class Test {

	public static void main(String[] args) {
		StandardPBEStringEncryptor stringPBEConfig = new StandardPBEStringEncryptor();
		stringPBEConfig.setPassword("ksmart38"); 			//대칭키 (암호화키)
		stringPBEConfig.setAlgorithm("PBEWithMD5AndDES"); 	//사용할 암호화알고리즘
		
		String jdbcUrl = "jdbc:log4jdbc:mysql://localhost:3306/ksmart38db?serverTimezone=UTC&characterEncoding=UTF8";
		String userName = "root";
		String password = "java0000";
		
		System.out.println("평문(jdbcUrl):"+ jdbcUrl);
		System.out.println("암호문(jdbcUrl):"+ stringPBEConfig.encrypt(jdbcUrl));
		System.out.println("평문(userName):"+ userName);
		System.out.println("암호문(userName):"+ stringPBEConfig.encrypt(userName));
		System.out.println("평문(password):"+ password);
		System.out.println("암호문(password):"+ stringPBEConfig.encrypt(password));
		
		System.out.println("복호화(jdbcUrl):"+ stringPBEConfig.decrypt("eHA3ePN3vJG6XIBveZ0r0o/gZnlJVtdOBJljjl9nD/SP9u6IQLl4ymZEG09TR6/pDAM9BNFmhvSkH8dfJjV7TjSmXxuT7vLdSRsW0/aXhOaPaqGAOCeOMZmnqCEiu3WZEtt/z7mNbkI="));
		System.out.println("복호화(userName):"+ stringPBEConfig.decrypt("S+8PSEIu7j94n+2cGOT47Q=="));
		System.out.println("복호화(password):"+ stringPBEConfig.decrypt("SmQ9IDQi9RlWWgl7tenMGkRKixHvgrqg"));

	}

}
