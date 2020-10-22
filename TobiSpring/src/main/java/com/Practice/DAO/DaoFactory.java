package com.Practice.DAO;

public class DaoFactory {
	
	public UserDao userDao() {
		return new UserDao(new NConnectionMaker());
	}
	
	public AccountDao accountDao() {
		return new AccountDao(new NConnectionMaker());
	}
	
	public MessageDao messageDao() {
		return new MessageDao(new DConnectionMaker());
	}

}
