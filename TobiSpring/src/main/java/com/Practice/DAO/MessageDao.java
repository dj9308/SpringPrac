package com.Practice.DAO;


import org.springframework.stereotype.Repository;


@Repository
public class MessageDao {
	
	@SuppressWarnings("unused")
	private ConnectionMaker connectionmaker;
	
	public MessageDao(ConnectionMaker connectionMaker) {
		this.connectionmaker = connectionMaker;
	}
}
