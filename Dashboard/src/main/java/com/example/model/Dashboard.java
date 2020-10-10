package com.example.model;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "dashboard")
public class Dashboard {
	public static final String SINGULAR = "dashboard";
	public static final String MULTIPLE = "dashboards";
	
	@Id
	private long id;
	
	@Column(length=20)
	private long num;
	
	@Column(length=255)
	private String title;

	@Column(length=255)
	private String writer;
	
	@CreationTimestamp
	private Timestamp date;
	
	@Column(length = 20)
	private long cnt;
	
	@Column(length = 20)
	private long rcmd;

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

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
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

	@Override
	public String toString() {
		return "Dashboard [num=" + num + ", title=" + title + ", writer=" + writer + ", date=" + date + ", cnt=" + cnt
				+ ", rcmd=" + rcmd + "]";
	}
	
}

