package com.Practice.DAO;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {
	@Bean
	public UserDao userDao() {
		return new UserDao(new NConnectionMaker());
	}
	
	@Bean
	public AccountDao accountDao() {
		return new AccountDao(new NConnectionMaker());
	}
	
	@Bean
	public MessageDao messageDao() {
		return new MessageDao(new DConnectionMaker());
	}
	
	@Bean
	public ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
	}
}
