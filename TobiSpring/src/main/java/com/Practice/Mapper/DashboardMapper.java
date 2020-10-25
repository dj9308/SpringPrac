package com.Practice.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.Practice.VO.DashboardVO;

@Mapper
public interface DashboardMapper {
	@Insert("INSERT INTO dashboard (`title`,`writer`,`date`) VALUE ('#{title}','#{writer}',NOW())")
	public void insertDashboard(DashboardVO dashboard);
	
	@Select("SELECT * FROM dashboard")
	public List<DashboardVO> getDashbaordList();
	
}
