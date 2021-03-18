package com.cafemgt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cafemgt.dao.StockMapper;
import com.cafemgt.dto.StockDto;


@Service
public class StockService {

	private final StockMapper stockMapper;
	
	public StockService(StockMapper stockMapper) {
		this.stockMapper= stockMapper;
	}
	
	public List<StockDto> getStock() {
		
		return stockMapper.getStock();
	}
	
}
