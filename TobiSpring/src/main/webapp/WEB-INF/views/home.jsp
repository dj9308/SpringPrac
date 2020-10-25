<%@page import="com.Practice.VO.DashboardVO"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>
		Hello world!  
	</h1>
	<P>  The time on the server is ${serverTime}. </P>
	<table>
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>글쓴이</td>
			<td>시간</td>
			<td>조회수</td>
			<td>추천수</td>
		</tr>
		<c:forEach items="${dashboardList}">
			<tr>
				<td>dashboardList.num</td>
				<td>dashboardList.title</td>
				<td>dashboardList.writer</td>
				<td>dashboardList.date</td>
				<td>dashboardList.cnt</td>
				<td>dashboardList.rcmd</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
