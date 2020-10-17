package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Dashboard;
import com.example.demo.repository.DashboardRepository;

@Service
public abstract class SuperDashboardService {
	@Autowired
	DashboardRepository dashboardRepository;
	
	public Dashboard findbynum(long num) {
		return dashboardRepository.findByNum(num);
	}
	
	protected abstract Object Paging();
}
