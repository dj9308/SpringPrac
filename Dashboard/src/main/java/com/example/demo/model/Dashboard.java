package com.example.demo.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "dashboard")
public class Dashboard {
	public static final String SINGULAR = "dashboard";
	public static final String MULTIPLE = "dashboards";
	
	
	
	@Id
	private long num;
	
	@Column(length=255)
	private String title;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "writer")
	private User users;
	
	@CreationTimestamp
	private Timestamp date;
	
	@Column(length = 20)
	private long cnt;
	
	@Column(length = 20)
	private long rcmd;
	
	@Column
	private String content;

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public long getCnt() {
		return cnt;
	}

	public void setCnt(long cnt) {
		this.cnt = cnt;
	}

	public long getRcmd() {
		return rcmd;
	}

	public void setRcmd(long rcmd) {
		this.rcmd = rcmd;
	}

	public static String getSingular() {
		return SINGULAR;
	}

	public static String getMultiple() {
		return MULTIPLE;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}
	

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Dashboard [num=" + num + ", title=" + title + ", users=" + users + ", date=" + date + ", cnt=" + cnt
				+ ", rcmd=" + rcmd + ", content=" + content + "]";
	}
	
}

