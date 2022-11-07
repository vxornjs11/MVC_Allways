<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>추가상품 리스트 보기</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="managerstyle.css">
</head>
<body>
<fmt:setLocale value="ko_kr"/>
<div align="center">
	<h1 style="margin-bottom:3%;margin-top:3%"><b>추가상품 리스트</b></h1>
	<form action="#">
		<div align="center" style="margin-bottom:10px;padding:5px;width:90%">
			<div style="width:20%;display:inline-block" align="left">
				<input type="text" size="1" class="form-control" name="query" style="border-color:#a87878">
			</div>
			<div style="width:25%;display:inline-block" align="left">
				<input type="submit" class="btn btn-primary" style="background:#ffffff;border-color:#a87878;color:#a87878" value="검색">
			</div>
			<div style="width:50%;display:inline-block" align="right">
				<span style="font-size:1.2em">총 ${Size}건</span>
			</div>
		</div>
	</form>
	<div class="tablediv">
		<table class="table">
			<tr>
				<th>메뉴번호</th>
				<th>카테고리</th>
				<th>이름</th>
				<th>가격</th>
			</tr>
			<c:forEach var="cnt" items="${Dtos}">
				<tr>
					<td>${cnt.goodsId}</td>
					<td>${cnt.goodsName}</td>
					<td>${cnt.goodCategory}</td>
					<td><fmt:formatNumber value="${cnt.goodsPrice}" type="currency"/></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</div>
</body>
</html>