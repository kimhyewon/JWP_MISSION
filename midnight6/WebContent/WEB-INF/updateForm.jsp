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
	<form name="user" method="post" action="/users/update">
		<div class="title"><h1>회원정보 수정</h1></div>
		<div class="control-group">
			<label class="control-label" for="userId">사용자 아이디</label>
			<div class="controls">
				<input type ="text" name="userId" readonly="readonly" value="${sessionScope.userId}"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="password">비밀번호</label>
			<div class="controls">
				<input type ="password" id="password" name="password" placeholder="">
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="name">이름</label>
			<div class="controls">
				<input type ="text" id="name" name="name" placeholder="">
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="email">이메일</label>
			<div class="controls">
				<input type ="text" id="email" name="email" placeholder="">
			</div>
		</div>
		<div class="control-group">
			<div class="controls">
				<button type ="submit" class="btn btn-primary">수정완료</button>
			</div>
		</div>
	</form>
</body>
</html>