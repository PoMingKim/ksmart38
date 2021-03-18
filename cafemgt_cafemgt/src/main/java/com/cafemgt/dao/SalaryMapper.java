package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.SalaryDto;

@Mapper
public interface SalaryMapper {
	public List<SalaryDto> getSalary();
}
