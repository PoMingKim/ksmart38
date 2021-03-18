package com.cafemgt.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafemgt.dto.ArticleDto;
import com.cafemgt.dto.SkkDto;
import com.cafemgt.dto.StockDto;
import com.cafemgt.service.ArticleService;
import com.cafemgt.service.SkkService;
import com.cafemgt.service.StockService;

@Controller
public class StockController {
	
	private final ArticleService articleService;
	private final SkkService skkService;
	private final StockService stockService;
	
	
	@Autowired
	public StockController(ArticleService articleService
							,SkkService skkService
							,StockService stockService) {
		this.articleService = articleService;
		this.skkService = skkService;
		this.stockService = stockService;
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("======================================");
		System.out.println("======= StockController bean 등록 ======");
		System.out.println("======================================");
	}
	
	@GetMapping("/addarticle")
	public String addarticle() {
		
		return "stock/addarticle";
	}
	
	@GetMapping("/addskk")
	public String addskk() {
		
		return "stock/addskk";
	}
	
	@GetMapping("/getarticle")
	public String getarticle(Model model) {
		List<ArticleDto> articleList = articleService.getArticle();
		model.addAttribute("articleList",articleList);
		
		return "stock/getarticle";
	}
	
	@GetMapping("/getskk")
	public String getskk(Model model) {
		List<SkkDto> skkList = skkService.getSkk();
		model.addAttribute("skkList",skkList);
		return "stock/getskk";
	}
	
	@GetMapping("/getstock")
	public String getstock(Model model) {
		List<StockDto> stockList = stockService.getStock();
		model.addAttribute("stockList",stockList);
		return "stock/getstock";
	}
	
	@GetMapping("/gettotalstock")
	public String gettotalstock() {
		
		return "stock/gettotalstock";
	}
}
