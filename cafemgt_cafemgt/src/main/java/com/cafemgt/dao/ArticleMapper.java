package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.ArticleDto;

@Mapper
public interface ArticleMapper {
	public List<ArticleDto> getArticle();
}
