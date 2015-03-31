<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form class="form_horizontal" method="get" action="/">
	
	<c:set var="userId" scope="session" value="${userId}"/>
	<%-- <c:set var="userId" value="${sessionScope.userId}"/> --%>
	
	<%-- <c:out value="${userId}" /> --%>
	<ul class="nav">
		<li><a href="/">Home</a></li>
		<c:choose>
		<c:when test="${not empty userId}">
		<li><a href="/users/logout">로그아웃</a></li>
		<li><a href="/users/update">개인정보수정</a></li>
		</c:when> 
		<c:otherwise>
		<li><a href="/users/login">로그인</a></li>
		<li><a href="/users/save">회원가입</a></li>
		</c:otherwise>
		</c:choose>
	</ul>
</body>
</html>