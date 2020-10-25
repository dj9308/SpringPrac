package com.Practice.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Practice.DAO.UserDao;
import com.Practice.VO.DashboardVO;

@Service
public class UserService {
	@Autowired
	UserDao userDao;
	
	public List<DashboardVO> selectDashboard() {
		return null;
	}
}
