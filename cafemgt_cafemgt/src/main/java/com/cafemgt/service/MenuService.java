package com.cafemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafemgt.dao.MenuMapper;
import com.cafemgt.dto.MenuDto;

@Service
public class MenuService {

	private final MenuMapper menuMapper;
	
	public MenuService(MenuMapper menuMapper) {
		this.menuMapper= menuMapper;
	}
	
	public List<MenuDto> getMenu() {
		
		return menuMapper.getMenu();
	}
}
