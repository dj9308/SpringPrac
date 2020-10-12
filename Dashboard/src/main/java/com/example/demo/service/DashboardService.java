package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.DashboardMapper;
import com.example.demo.model.Dashboard;

@Service
public class DashboardService {
	@Autowired
	DashboardMapper dashboardmapper;
	
	public List<Dashboard> list(){
		return dashboardmapper.findall();
	}
}
