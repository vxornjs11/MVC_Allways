<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 메인페이지</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="managerstyle.css">
</head>
<body>
<fmt:setLocale value="ko_kr"/>
<div align="center">
<h1 style="margin-bottom:3%;margin-top:3%"><b>Manager Main</b></h1>
<div class="main">
<h2 class="inner">최근 매출</h2>
<div align="right" style="margin:1px">
최근 5건
</div>
<div class="inner">
<table class="table table-striped">
<tr>
<th>날짜</th>
<th>주문량</th>
<th>매출</th>
</tr>
<c:forEach var="cnt" begin="1" end="5">
<tr>
<td>2022-10-05</td><td>5</td><td><fmt:formatNumber value="1000" type="currency"/></td>
</tr>
</c:forEach>
</table>
</div>
</div>
<div class="main">
<h2 class="inner">미답변 문의</h2>
<div align="right" style="margin:1px">
최근 5건
</div>
<div class="inner">
<table class="table table-striped">
<tr>
<th>날짜</th>
<th>주문량</th>
<th>매출</th>
</tr>
<c:forEach var="cnt" begin="1" end="5">
<tr>
<td>2022-10-05</td><td>5</td><td>100000</td>
</tr>
</c:forEach>
</table>
</div>
</div>
<div class="main">
<h2 class="inner">최근 주문 건수</h2>
<div align="right" style="margin:1px">
최근 5건
</div>
<div class="inner">
<table class="table table-striped">
<tr>
<th>날짜</th>
<th>주문량</th>
<th>매출</th>
</tr>
<c:forEach var="cnt" begin="1" end="5">
<tr>
<td>2022-10-05</td><td>5</td><td><fmt:formatNumber value="1000" type="currency"/></td>
</tr>
</c:forEach>
</table>
</div>
</div>
<div class="main">
<h2 class="inner">오늘의 리뷰</h2>
<div align="right" style="margin:1px">
최근 5건
</div>
<div class="inner">
<table class="table table-striped">
<tr>
<th>날짜</th>
<th>주문량</th>
<th>매출</th>
</tr>
<c:forEach var="cnt" begin="1" end="5">
<tr>
<td>2022-10-05</td><td>5</td><td>100000</td>
</tr>
</c:forEach>
</table>
</div>
</div>
</div>
</body>
</html>