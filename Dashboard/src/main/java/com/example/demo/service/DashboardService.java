package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.DashboardMapper;
import com.example.demo.model.Dashboard;
import com.example.demo.repository.DashboardRepository;

@Service
public class DashboardService extends SuperDashboardService{
	@Autowired
	DashboardMapper dashboardmapper;
	@Autowired
	DashboardRepository dashboardRepository;
	
	@Override
	public Dashboard findbynum(long num) {
		// TODO Auto-generated method stub
		return super.findbynum(num);
	}
	
	public List<Dashboard> list(){
		return dashboardRepository.findAll();
	}

	@Override
	public Object Paging() {
		// TODO Auto-generated method stub
		return dashboardRepository.findAll();
	}
	
}
