<%@page import="com.javalec.Dto.Dto"%>
<%@page import="java.util.List"%>
<%@page import="com.javalec.Dto.RDto"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	RDto dt=new RDto();
	List<Dto> list=dt.getList();
	
%>

<table>
	<%for(int i=0;i<list.size();i++) {
	
	%><tr>
	<td><%= list.get(i).getName()  %></td>
	<td><%= list.get(i).getPrice() %></td>	
	
	</tr><% 
	}%>
	<tr>
	<td>zz</td>
	<td>td</td>
	</tr>

</table>

</body>
</html>