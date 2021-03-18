package com.cafemgt.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafemgt.dto.MenuDto;
import com.cafemgt.dto.RecipyDto;
import com.cafemgt.service.MenuService;
import com.cafemgt.service.RecipyService;

@Controller
public class MenuController {
	
	private final MenuService menuService;
	private final RecipyService recipyService;
	
	@Autowired
	public MenuController(MenuService menuService,RecipyService recipyService) {
		this.menuService = menuService;
		this.recipyService=recipyService;
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("======================================");
		System.out.println("======= MenuController bean 등록 ======");
		System.out.println("======================================");
	}
	
	@GetMapping("/addmenu")
	public String addmenu() {
		
		return "menu/addmenu";
	}
	
	@GetMapping("/addrecipy")
	public String addrecipy() {
		
		return "menu/addrecipy";
	}
	
	@GetMapping("/getmenu")
	public String getmenu(Model model) {
		List<MenuDto> menuList = menuService.getMenu();
		model.addAttribute("menuList",menuList);
		return "menu/getmenu";
	}
	
	@GetMapping("/getrecipy")
	public String getrecipy(Model model) {
		List<RecipyDto> recipyList = recipyService.getRecipy();
		model.addAttribute("recipyList",recipyList);
		return "menu/getrecipy";
	}
	
	
	
}
