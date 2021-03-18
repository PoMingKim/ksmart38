package com.cafemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafemgt.dao.SkkMapper;
import com.cafemgt.dto.SkkDto;


@Service
public class SkkService {
	
	private final SkkMapper skkMapper;
	
	public SkkService(SkkMapper skkMapper) {
		this.skkMapper= skkMapper;
	}
	
	public List<SkkDto> getSkk() {
		
		return skkMapper.getSkk();
	}
}
