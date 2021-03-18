package com.cafemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafemgt.dao.WtimeMapper;
import com.cafemgt.dto.WtimeDto;

@Service
public class WtimeService {
	
	private final  WtimeMapper  wtimeMapper;
	
	@Autowired
	public WtimeService(WtimeMapper wtimeMapper) {
		this.wtimeMapper= wtimeMapper;
	}
	
	public List<WtimeDto> getWtime(){
		List<WtimeDto> wtimeDto = wtimeMapper.getWtime();
		
		return wtimeDto;
	}
}
