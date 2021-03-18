package com.cafemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafemgt.dao.BonusMapper;
import com.cafemgt.dto.BonusDto;

@Service
public class BonusService {
	
	private final  BonusMapper  bonusMapper;
	
	@Autowired
	public BonusService(BonusMapper bonusMapper) {
		this.bonusMapper= bonusMapper;
	}
	
	public List<BonusDto> getBonus(){
		List<BonusDto> bonusDto = bonusMapper.getBonus();
		
		return bonusDto;
	}
}
