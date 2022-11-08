<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>주문 상태 변환</h1>
	<form method="get" action="ADDR.do" name = "ADDR">
	<table border="0">
	<tr>
	<td>
	<tr>
		<td>주문 번호 :
		<input type="text" name=ordersId value="${add_Order.ordersId}" readonly/>
		</td>
	</tr>
	
	<tr>
		<td>주문 상태 :
		<input type="text" name="ordersStatus" value="${add_Order.ordersStatus}" >
		</td>
	</tr>
	<tr>
		<td>구매자 :
		<input type="text" name="o_customerId" value="${add_Order.o_customerId}" >
		</td>
	</tr>
	
	<tr>
		<td>케이크번호 :
		<input type="text" name="o_cakeId" value="${add_Order.o_cakeId}" >
		</td>
	</tr>
	
	<tr>
		<td>추가상품번호:
		<input type="text" name="o_goodsId" value="${add_Order.o_goodsId}" >
		</td>
	</tr>
	
	<tr>
		<td>주문가격 :
		<input type="text" name="ordersSalePrice" value="${add_Order.ordersSalePrice}" >
		</td>
	</tr>
	<tr>
		<td>주문개수 :
		<input type="text" name="ordersQuantity" value="${add_Order.ordersQuantity}" >
		</td>
	</tr>
	
	<tr>
		<td>
			<input type="button" value="돌아가기" onclick="Return()">
			<input type="button" value="수정" onclick="Update()">
			<input type="button" value="삭제" onclick="Delete()">
			<input type="submit" value="추가">
		</td>
	</tr>
	</table>
		
	</form>
</body>
</html>