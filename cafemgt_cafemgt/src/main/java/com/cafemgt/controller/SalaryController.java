package com.cafemgt.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafemgt.dto.BonusDto;
import com.cafemgt.dto.DsalaryDto;
import com.cafemgt.dto.SalaryDto;
import com.cafemgt.dto.WtimeDto;
import com.cafemgt.service.SalaryService;
import com.cafemgt.service.WtimeService;
import com.cafemgt.service.BonusService;
import com.cafemgt.service.DsalaryService;

@Controller
public class SalaryController {
	
	private final SalaryService salaryService;
	private final DsalaryService dsalaryService;
	private final WtimeService wtimeService;
	private final BonusService bonusService;
	
	@Autowired
	public SalaryController(SalaryService salaryService
						   ,DsalaryService dsalaryService
						   ,WtimeService wtimeService
						   ,BonusService bonusService) {
		this.salaryService = salaryService;
		this.dsalaryService = dsalaryService;
		this.wtimeService = wtimeService;
		this.bonusService = bonusService;
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("======================================");
		System.out.println("======= SalaryController bean 등록 ======");
		System.out.println("======================================");
	}
	
	@GetMapping("/addsalary")
	public String addsalary() {

		return "salary/addsalary";
	}
	
	@GetMapping("/getsalary")
	public String getsalary(Model model) {
		
		List<SalaryDto> salaryList = salaryService.getSalary();
		model.addAttribute("salaryList",salaryList);
		
		return "salary/getsalary";
	}
	
	
	
	@GetMapping("/adddsalary")
	public String adddsalary() {
		
		return "dsalary/adddsalary";
	}
	
	@GetMapping("/getdsalary")
	public String getdsalary(Model model) {
		
		List<DsalaryDto> dsalaryList = dsalaryService.getDsalary();
		model.addAttribute("dsalaryList",dsalaryList);
		
		return "dsalary/getdsalary";
	}
	
	
	
	@GetMapping("/addwtime")
	public String addwtime() {
		
		
		
		return "dsalary/addwtime";
	}
	
	@GetMapping("/getwtime")
	public String getwtime(Model model) {
		
		List<WtimeDto> wtimeList = wtimeService.getWtime();
		model.addAttribute("wtimeList",wtimeList);
		
		return "dsalary/getwtime";
	}
	
	
	@GetMapping("/addbonus")
	public String addbonus() {
		
		return "bonus/addbonus";
	}
	
	@GetMapping("/getbonus")
	public String getbonus(Model model) {
		
		List<BonusDto> bonusList = bonusService.getBonus();
		model.addAttribute("bonusList",bonusList);
		
		return "bonus/getbonus";
	}
	
}
