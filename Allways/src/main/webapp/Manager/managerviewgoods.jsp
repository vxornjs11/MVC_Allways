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
<link rel="shortcut icon" href="./images/HeaderLogo2.png" sizes="180x180">
<style>
	a.tablebutton{
		color:#000000;
		font-size:1.4em;
		text-decoration:none;
		margin:10px;
	}
	a.tablebutton:hover{
		color:#a87878;
	}
</style>
</head>
<body>
<%@include file="managerHeader.jsp"%>
<fmt:setLocale value="ko_kr"/>
<div align="center">
	<h1 style="margin-bottom:3%;margin-top:3%"><b>추가상품 리스트</b></h1>
	<form action="searchGoods.do">
		<div align="center" style="margin-bottom:10px;padding:5px;width:90%">
			<div style="width:20%;display:inline-block" align="left">
				<input type="text" size="1" class="form-control" name="query" style="border-color:#a87878" value="${Query }">
			</div>
			<div style="width:25%;display:inline-block" align="left">
				<input type="submit" class="btn btn-primary" style="background:#ffffff;border-color:#a87878;color:#a87878" value="검색">
			</div>
			<div style="width:50%;display:inline-block" align="right">
				<span style="font-size:1.6em">총 ${Size}건</span>
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
			<c:forEach var="cnt" items="${Dtos}" begin="${(index-1)*rowcount }" end="${(index)*rowcount-1}">
				<tr>
					<td>${cnt.goodsId}</td>
					<td><a href="viewGoodsDetail.do?goodsName=${cnt.goodsName }" class="tablebutton">${cnt.goodsName}</a></td>
					<td>${cnt.goodsCategory}</td>
					<td><fmt:formatNumber value="${cnt.goodsPrice}" type="currency"/></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div class="tablediv" align="right">
		<a href="managercreategoods.jsp" style="color:#a87878;text-decoration:none">추가</a>
	</div>
	<!-- 페이지 분할: 검색 안했을 때 -->
	<c:if test="${Query==null }">
	<div class="tablediv" align="center">
		<a href="viewGoodsList.do?index=1" class="tablebutton">처음으로</a>
		<c:if test="${index!=1 }">
			<a href="viewGoodsList.do?index=${index-1 }" class="tablebutton">이전</a>
		</c:if>
		<c:forEach var="cnt" begin="${pagecount*pagepage+1}" end="${pagecount*(pagepage+1) }">
			<c:if test="${cnt<=Math.ceil(Size/rowcount) }">
				<c:if test="${cnt==index }">
					<span style="display:inline">
						<a href="viewGoodsList.do?index=${cnt }" style="font-size:1.3em" class="tablebutton">${cnt }</a>
					</span>
				</c:if>
				<c:if test="${cnt!=index }">
					<a href="viewGoodsList.do?index=${cnt }" style="font-size:0.9em" class="tablebutton">${cnt }</a>
				</c:if>
			</c:if>
		</c:forEach>
		<c:if test="${index<Math.ceil(Size/rowcount) }">
			<a href="viewGoodsList.do?index=${index+1 }" class="tablebutton">다음</a>
		</c:if>
		<a href="viewGoodsList.do?index=${Math.ceil(Size/rowcount) }" class="tablebutton">끝으로</a>
	</div>
	</c:if>
	
	<c:if test="${Query!=null }">
	<div class="tablediv" align="center">
		<a href="searchGoods.do?index=1&query=${Query}">처음으로</a>
		<c:if test="${index!=1 }">
			<a href="searchGoods.do?index=${index-1 }&query=${Query}" class="tablebutton">이전</a>
		</c:if>
		<c:forEach var="cnt" begin="${pagecount*pagepage+1}" end="${pagecount*(pagepage+1) }">
			<c:if test="${cnt<=Math.ceil(Size/rowcount) }">
				<c:if test="${cnt==index }">
					<span style="display:inline">
						<a href="searchGoods.do?index=${cnt }&query=${Query}" style="font-size:1.3em" class="tablebutton">${cnt }</a>
					</span>
				</c:if>
				<c:if test="${cnt!=index }">
					<a href="searchGoods.do?index=${cnt }&query=${Query}" style="font-size:0.9em" class="tablebutton">${cnt }</a>
				</c:if>
			</c:if>
		</c:forEach>
		<c:if test="${index<Math.ceil(Size/rowcount) }">
			<a href="searchGoods.do?index=${index+1 }&query=${Query}" class="tablebutton">다음</a>
		</c:if>
		<a href="searchGoods.do?index=${Math.ceil(Size/rowcount) }&query=${Query}" class="tablebutton">끝으로</a>
	</div>
	</c:if>
</div>
</body>
</html>