<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>매니저 로그인 페이지</title>
</head>
<body align="center">
<form action="managerLogin.do">

	<h1> Login</h1>
	ID :
	<input type="text" name="managerId"><br>
	<c:if test="${CHECK==false }">
			<p class="lead"style="color:red;"  style="font-size:0.8em;margin:10px" >ID 또는 비밀번호가 일치하지 않습니다.</p>
	</c:if>
	
	Password:
	<input type="password" name="managerPw">
	<input type="submit" name="login" value="LOGIN">
	
</form>
</body>
</html>