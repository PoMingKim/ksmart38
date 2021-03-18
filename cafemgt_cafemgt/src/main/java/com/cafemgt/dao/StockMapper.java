package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.StockDto;

@Mapper
public interface StockMapper {
	public List<StockDto> getStock();
}
