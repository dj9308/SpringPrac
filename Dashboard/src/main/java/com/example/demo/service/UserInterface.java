package com.example.demo.service;

import java.sql.SQLException;
import java.util.List;

import com.example.demo.model.Dashboard;

public interface UserInterface {
	public List<Dashboard> Paging() throws ClassNotFoundException, SQLException;
}
