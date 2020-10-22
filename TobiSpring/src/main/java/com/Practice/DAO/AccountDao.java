package com.Practice.DAO;


import org.springframework.stereotype.Repository;

@Repository
public class AccountDao {
	
	@SuppressWarnings("unused")
	private ConnectionMaker connectionmaker;
	
	public AccountDao(ConnectionMaker connectionMaker) {
		this.connectionmaker = connectionMaker;
	}
	

}
