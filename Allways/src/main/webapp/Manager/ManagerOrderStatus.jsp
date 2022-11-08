<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>주문현황</title>
<%@include file="managerHeader.jsp"%>
</head>
<body>
<script type="text/javascript">
function Produce(){
		var orderList = document.orderList;
		orderList.action="GGp.do";
		orderList.submit();
		}
		
</script>
<h1>주문접수</h1>
<form name="orderList" method="get">
<table border="1" >
		<tr>
			<td>주문번호</td>
			<td>주문상태</td>
			<td>구매자</td>
			<td>케이크번호</td>
			<td>추가상품번호</td>
			<td>주문가격</td>
			<td>주문개수</td>
		</tr>	
			<c:forEach items = "${OrdersList}" var = "dto">
		<tr>
			<td><a href="Status.do?ordersId=${dto.ordersId}">${dto.ordersId}</a></td>
			<td>${dto.ordersStatus}</td>
			<td>${dto.o_customerId}</td>
			<td>${dto.o_cakeId}</td>
			<td>${dto.o_goodsId}</td>
			<td>${dto.ordersSalePrice}</td>
			<td>${dto.ordersQuantity}</td>
		</tr>
			</c:forEach>
			<tr>
			<td><input type="button" value="제작" name="produce" onclick="Produce()"></td>
			</tr>
</table>
</form>

<h1>제작중</h1>
<table border="1" >
		<tr>
			<td>주문번호</td>
			<td>주문상태</td>
			<td>구매자</td>
			<td>케이크번호</td>
			<td>추가상품번호</td>
			<td>주문가격</td>
			<td>주문개수</td>
		</tr>	
			<c:forEach items = "${OrdersList2}" var = "dto2">
		<tr>
			<td><a href="Status.do?ordersId=${dto2.ordersId}">${dto2.ordersId}</a></td>
			<td>${dto2.ordersStatus}</td>
			<td>${dto2.o_customerId}</td>
			<td>${dto2.o_cakeId}</td>
			<td>${dto2.o_goodsId}</td>
			<td>${dto2.ordersSalePrice}</td>
			<td>${dto2.ordersQuantity}</td>
		</tr>
			</c:forEach>
			<tr>
			<td><input type="button" value="완료" name="Final" onclick="Final()"></td>
			</tr>
</table>
<h1>제작완료</h1>
<table border="1" >
		<tr>
			<td>주문번호</td>
			<td>주문상태</td>
			<td>구매자</td>
			<td>케이크번호</td>
			<td>추가상품번호</td>
			<td>주문가격</td>
			<td>주문개수</td>
		</tr>	
			<c:forEach items = "${OrdersList3}" var = "dto3">
		<tr>
			<td><a href="Status.do?ordersId=${dto3.ordersId}">${dto3.ordersId}</a></td>
			<td>${dto3.ordersStatus}</td>
			<td>${dto3.o_customerId}</td>
			<td>${dto3.o_cakeId}</td>
			<td>${dto3.o_goodsId}</td>
			<td>${dto3.ordersSalePrice}</td>
			<td>${dto3.ordersQuantity}</td>
		</tr>
			</c:forEach>
			<tr>
			<td><input type="button" value="돌아가기" name="Final" onclick="Final()"></td>
			</tr>
</table>
</body>
</html>