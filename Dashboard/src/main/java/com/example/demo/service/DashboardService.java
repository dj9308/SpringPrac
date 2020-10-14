package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.DashboardMapper;
import com.example.demo.model.Dashboard;
import com.example.demo.repository.DashboardRepository;

@Service
public class DashboardService {
	@Autowired
	DashboardMapper dashboardmapper;
	@Autowired
	DashboardRepository dashboardRepository;
		
	public List<Dashboard> list(){
		return dashboardRepository.findAll();
	}
}
