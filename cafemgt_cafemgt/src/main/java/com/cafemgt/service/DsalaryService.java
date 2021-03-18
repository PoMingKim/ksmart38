package com.cafemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafemgt.dao.DsalaryMapper;
import com.cafemgt.dto.DsalaryDto;

@Service
public class DsalaryService {
	
	private final  DsalaryMapper  dsalaryMapper;
	
	@Autowired
	public DsalaryService(DsalaryMapper dsalaryMapper) {
		this.dsalaryMapper= dsalaryMapper;
	}
	
	public List<DsalaryDto> getDsalary(){
		List<DsalaryDto> dsalaryDto = dsalaryMapper.getDsalary();
		
		return dsalaryDto;
	}
}
