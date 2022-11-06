<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ALLWAYS JOIN</title>
</head>
<body>
	<div align="center">
	<h2>JOIN</h2>
	<form name="customerJoin" action="customerJoin.do" method="post" enctype="multipart/form-data">
		<label>ID</label><br>
		<c:if test="${CHECK==true }">
		<input type="text" name="customerId" placeholder="영어 소문자와 숫자만 가능" size="25" value="${CHECKID }">
		<input type="button" name="idcheck" value="중복 확인" onclick="CheckId()" >
		
		<script>alert("이미 존재하는 ID입니다.")</script>
		
		
		</c:if>
		<c:if test="${CHECK==false }">사용 가능한 ID입니다.
		<td><input type="hidden" name="idDuplication" value="1"/></td></c:if>
		
		
		
	
	
	</form>
	</div>

</body>
</html>