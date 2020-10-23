package com.Practice.TobiSpring;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Practice.DAO.DaoFactory;
import com.Practice.DAO.UserDao;
import com.Practice.VO.UserVO;

public class UserDaoTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
		UserDao dao = context.getBean("userDao",UserDao.class);
		int i =0;
		UserVO user = new UserVO();
		user.setId("testId");
		user.setName("omg");
		user.setPassword("hi");
		while(!dao.get(user.getId()).getId().isEmpty()) {
			i++;
			user.setId("testId"+i);
		}
		dao.add(user);
		
		System.out.println(user.getId()+" 등록 성공 ");
		UserVO user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		System.out.println(user.getId()+" 조회 성공 ");
	}

}
