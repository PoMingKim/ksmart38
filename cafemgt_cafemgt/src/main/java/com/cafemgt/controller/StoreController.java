package com.cafemgt.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StoreController {
	
	@PostConstruct
	public void initialize() {
		System.out.println("======================================");
		System.out.println("======= StoreController bean 등록 ======");
		System.out.println("======================================");
	}
	
	@GetMapping("/addstore")
	public String addstore() {
		
		return "store/addstore";		
	}
	
	@GetMapping("/addcustomer")
	public String addcustomer() {
		
		return "store/addcustomer";	
	}
	
	@GetMapping("/adduser")
	public String adduser() {
		
		return "store/adduser";	
	}
	
	@GetMapping("/getstore")
	public String getstore() {
		
		return "store/getstore";	
	}
	
	@GetMapping("/getcustomer")
	public String getcustomer() {
		
		return "store/getcustomer";	
	}
	
	@GetMapping("/getuser")
	public String getuser() {
		
		return "store/getuser";	
	}

}
