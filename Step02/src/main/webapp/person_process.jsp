<%@page import="vo.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>
<%
	//이름 나이 읽어옴
	String name = request.getParameter("name");
	int age = Integer.parseInt(request.getParameter("age"));
	//Person 생성
	Person p = new Person(name,age);
	request.setAttribute("person", p);
	//person_result.jsp로 이동
	request.getRequestDispatcher("person_result.jsp").forward(request, response);	
%>