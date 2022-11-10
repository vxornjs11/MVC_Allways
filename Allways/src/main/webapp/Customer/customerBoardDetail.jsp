<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

#title {
	text-align: left;
}

</style>
</head>
<body>

	<%@include file="customerHeader.jsp" %>
	<%-- <h6>No.${boardDetail.writeId}</h6>&nbsp;&nbsp;
	<h6>작성자: ${boardDetail.w_customerId}</h6>&nbsp;&nbsp;
	<h6>제목: ${boardDetail.writeTitle}</h6>&nbsp;&nbsp;
	<h6>작성일자: ${boardDetail.writeInitdate}</h6> --%>
	<div>
		<table>
			<tr>
				<th width="100" style = "text-align: left"><h6>No.${boardDetail.writeId}</h6>&nbsp;&nbsp;</th>
				<th width="100" style = "text-align: left"><h6>작성자: ${boardDetail.w_customerId}</h6>&nbsp;&nbsp;</th>
				<th width="100" style = "text-align: left"><h6>제목: ${boardDetail.writeTitle}</h6>&nbsp;&nbsp;</th>
				<th width="100" style = "text-align: right"><h6>작성일자: ${boardDetail.writeInitdate}</h6></th>
			</tr>
		</table>
		
		<textarea rows="7" cols="55">${boardDetail.writeContent}</textarea>
		
	</div>
	
	
</body>
</html>