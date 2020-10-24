package com.Practice.VO;

import java.sql.Timestamp;

public class DashboardVO {
	
	private int num;
	private String title;
	private String writer;
	private String password;
	private Timestamp date;
	private int cnt;
	private int rcmd;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getRcmd() {
		return rcmd;
	}
	public void setRcmd(int rcmd) {
		this.rcmd = rcmd;
	}
	@Override
	public String toString() {
		return "DashboardVO [num=" + num + ", title=" + title + ", writer=" + writer + ", password=" + password
				+ ", date=" + date + ", cnt=" + cnt + ", rcmd=" + rcmd + "]";
	}
	
}
