package com.cafemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafemgt.dao.ArticleMapper;
import com.cafemgt.dto.ArticleDto;

@Service
public class ArticleService {
	
	private final ArticleMapper articleMapper;
	
	public ArticleService(ArticleMapper articleMapper) {
		this.articleMapper= articleMapper;
	}
	
	public List<ArticleDto> getArticle(){
		List<ArticleDto> articleDto = articleMapper.getArticle();
		
		return articleDto;
	}
}
