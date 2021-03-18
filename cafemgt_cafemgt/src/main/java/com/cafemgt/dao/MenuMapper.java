package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.MenuDto;

@Mapper
public interface MenuMapper {
	public List<MenuDto> getMenu();
}
