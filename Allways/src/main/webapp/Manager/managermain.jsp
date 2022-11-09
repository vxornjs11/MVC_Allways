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
<link rel="shortcut icon" href="./images/HeaderLogo2.png" sizes="180x180">
</head>
<body>
<%@include file="managerHeader.jsp"%>
<fmt:setLocale value="ko_kr"/>
<div align="center">
	<h1 style="margin-bottom:3%;margin-top:3%"><b>Manager Main</b></h1>
	<div class="main">
		<h2 class="inner">최근 매출</h2>
		<div align="right" style="margin:1px">
			<a href="#" class="viewall">전체보기</a>
		</div>
		<div class="inner">
			<table class="table">
				<tr>
					<th>날짜</th>
					<th>주문량</th>
					<th>매출</th>
				</tr>
				<c:forEach var="cnt" items="${SALESDTO }" begin="1" end="10">
					<tr>
						<td>${SALESDTO.ordersdate }</td>
						<td>${SALESDTO.ordersquantity }</td>
						<td><fmt:formatNumber value="${SALESDTO.ordersdate }" type="currency"/></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	<div class="main">
		<h2 class="inner">미답변 문의</h2>
		<div align="right" style="margin:1px">
			<a href="#" class="viewall">전체보기</a>
		</div>
		<div class="inner">
			<table class="table">
				<tr>
					<th>날짜</th>
					<th>작성자</th>
					<th>제목</th>
				</tr>
				<c:forEach var="cnt" begin="1" end="10">
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
			<a href="#" class="viewall">전체보기</a>
		</div>
		<div class="inner">
			<table class="table">
				<tr>
					<th>날짜</th>
					<th>주문량</th>
					<th>매출</th>
				</tr>
				<c:forEach var="cnt" items="${SALESDTO }" begin="1" end="10">
					<tr>
						<td>${SALESDTO.ordersdate }</td>
						<td>${SALESDTO.ordersquantity }</td>
						<td><fmt:formatNumber value="${SALESDTO.ordersdate }" type="currency"/></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	<div class="main">
		<h2 class="inner">최근 리뷰</h2>
		<div align="right" style="margin:1px">
			<a href="#" class="viewall">전체보기</a>
		</div>
		<div class="inner">
			<table class="table">
				<tr>
					<th>날짜</th>
					<th>작성자</th>
					<th>별점</th>
				</tr>
				<c:forEach var="cnt" items="${REVIEWDTO }" begin="1" end="10">
					<tr>
						<td><fmt:formatDate value="${cnt.oreviewInitdate }" type="both" dateStyle="full"/></td>
						<td>${cnt.or_customerId }</td>
						<td>${cnt.oreviewStarrating }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</div>
</body>
</html>