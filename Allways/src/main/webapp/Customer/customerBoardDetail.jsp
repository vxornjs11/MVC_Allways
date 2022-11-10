<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file="customerHeader.jsp" %>
	
	<div align="center">
		<table>
		
			<tbody>
				<tr>
					<td>${boardDetail.writeId}</td>
					<td>${boardDetail.w_customerId}</td>
					<td>${boardDetail.writeTitle}</td>
					<td>${boardDetail.writeInitdate}</td>
				</tr>
			</tbody>
			<tbody>
				<tr>
					<td><textarea rows="7" cols="55">${boardDetail.writeContent}</textarea></td>
				</tr>
			</tbody>
		</table>
	</div>
	
	
</body>
</html>