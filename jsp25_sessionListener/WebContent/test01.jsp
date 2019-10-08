<%@page import="test.listener.SessionCountListener"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test01.jsp</title>
</head>
<body>
<% 
	int userCount=SessionCountListener.getUserCount();
%>
현재 접속자수:<%=userCount %>
<h1>우리우리 쇼핑몰 방문을 환영합니다.... </h1>
</body>
</html>





