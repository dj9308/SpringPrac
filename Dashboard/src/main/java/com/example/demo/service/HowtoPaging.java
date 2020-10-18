package com.example.demo.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Dashboard;
import com.example.demo.repository.DashboardRepository;

@Service
public class HowtoPaging implements UserInterface{
	@Autowired
	DashboardRepository dashboardRepository;
	
	@Override
	public List<Dashboard> Paging() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return dashboardRepository.findAll();
	}
}
