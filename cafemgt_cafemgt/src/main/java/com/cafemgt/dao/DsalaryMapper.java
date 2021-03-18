package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.DsalaryDto;

@Mapper
public interface DsalaryMapper {
	public List<DsalaryDto> getDsalary();
}
