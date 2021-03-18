package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.RecipyDto;

@Mapper
public interface RecipyMapper {
	public List<RecipyDto> getRecipy();
}
