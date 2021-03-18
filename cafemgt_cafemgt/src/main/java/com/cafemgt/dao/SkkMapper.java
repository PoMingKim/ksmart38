package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.SkkDto;

@Mapper
public interface SkkMapper {
	public List<SkkDto> getSkk();
}
