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
		<table border="1">
		
			<thead>
				<tr>
					<th>No</th>
					<th>작성자</th>
					<th>제목</th>
					<th>내용</th>
					<th>작성일자</th>
				</tr>
			</thead>
			
		
			<c:forEach var = "dto" items="${boardDetail }">
				<tbody>
					<tr>
						<td>${dto.writeId}</td>
						<td>${dto.w_customerId}</td>
						<td>${dto.writeTitle}</td>
						<td>${dto.writeContent}</td>
						<td>${dto.writeInitdate}</td>
					</tr>
				</tbody>
			</c:forEach>
		</table>
	</div>
</body>
</html>