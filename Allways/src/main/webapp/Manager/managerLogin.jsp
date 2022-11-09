<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>매니저 로그인 페이지</title>
<style>
	div{
		padding:10px;
		
	}
	div.inlineblock{
		display:inline-block;
		margin-top:3%;
	}
</style>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="managerstyle.css">
<link rel="shortcut icon" href="./images/HeaderLogo2.png" sizes="180x180">
</head>
<body>
<div align="center">
<form action="managerLogin.do" method="post">

	<h1 style="margin-top:10%;width:50%">Manager Login</h1>
	<div style="width:50%">
		<div align="right" style="width:40%" class="inlineblock">
			<div style="width:30%;height:10%;font-size:1.2em" align="right">
				ID :
			</div>
			<div style="width:30%;height:10%;font-size:1.2em" align="right">
				Password:
			</div>
		</div>
		<div align="left" style="width:50%" class="inlineblock">
			<div style="width:50%">
				<input type="text" name="managerId" class="form-control" style="border-color:#fdcdcd">
			</div>
			<div style="width:50%;height:10%">
				<input type="password" name="managerPw" class="form-control" style="border-color:#fdcdcd">
			</div>
		</div>
	</div>
	<c:if test="${CHECK==false }">
			<p class="lead"style="color:red;"  style="font-size:0.8em;margin:10px" >ID 또는 비밀번호가 일치하지 않습니다.</p>
	</c:if>
	<input type="submit" name="login" value="LOGIN" class="btn" style="background:#ffffff;border-color:#a87878;color:#a87878">
	
</form>
</div>
</body>
</html>