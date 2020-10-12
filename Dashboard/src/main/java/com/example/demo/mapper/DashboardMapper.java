package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.Dashboard;

@Mapper
public interface DashboardMapper {
	@Select(value = "SELECT * FROM dashboard")
	List<Dashboard> findall();
	
}
