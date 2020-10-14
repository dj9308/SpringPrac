package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Dashboard;

@Repository
public interface DashboardRepository extends JpaRepository<Dashboard, Integer>{
	public List<Dashboard> findAll();
}
