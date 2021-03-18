package com.cafemgt.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaxController {
	@PostConstruct
	public void initialize() {
		System.out.println("======================================");
		System.out.println("======= TaxController bean 등록 ======");
		System.out.println("======================================");
	}
	
	@GetMapping("/addsales")
	public String addsales() {
		return "pands/addsales";
	}
	
	@GetMapping("/addpurchases")
	public String addpurchases() {
		return "pands/addpurchases";
	}
	
	@GetMapping("/addotherpurchases")
	public String addotherpurchases() {
		return "pands/addotherpurchases";
	}
	
	@GetMapping("/getsales")
	public String getsales() {
		return "pands/getsales";
	}
	
	@GetMapping("/getpurchases")
	public String getpurchases() {
		return "pands/getpurchases";
	}
	
	@GetMapping("/getotherpurchases")
	public String getotherpurchases() {
		return "pands/getotherpurchases";
	}
}
