package com.example.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Dashboard;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

@Repository
public interface DashboardRepository extends JpaRepository<Dashboard, Integer> {
	Iterable<Dashboard> findAll(Sort sort);
	public Page<Dashboard> findAll(Pageable pageable);
}
