package com.cafemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafemgt.dao.RecipyMapper;
import com.cafemgt.dto.RecipyDto;

@Service
public class RecipyService {

	private final RecipyMapper recipyMapper;
	
	public RecipyService(RecipyMapper recipyMapper) {
		this.recipyMapper= recipyMapper;
	}
	
	public List<RecipyDto> getRecipy() {
		
		return recipyMapper.getRecipy();
	}
}
