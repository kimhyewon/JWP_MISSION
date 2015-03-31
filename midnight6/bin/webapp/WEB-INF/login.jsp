<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form class="form_horizontal" method="post" action="/users/login">
		<c:if test="${not empty errorMessage}">
		<div class="control-group">
			<label class="error">${errorMessage}</label>
		</div>
		</c:if>

		
		<div class="title"><h1>로그인</h1></div>
		<div class="control-group">
			<label class="control-label" for="userId">사용자 아이디</label>
			<div class="controls">
				<input type ="text" name="userId" value="" />
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="password">비밀번호</label>
			<div class="controls">
				<input type ="password" id="password" name="password" placeholder="">
			</div>
		</div>
		<div class="control-group">
			<div class="controls">
				<button type ="submit" class="btn btn-primary">로그인</button>
			</div>
		</div>
	</form>
</body>
</html>