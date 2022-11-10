<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리뷰작성 페이지</title>

<link href="/assets/css/star.css" rel="stylesheet"/>

</head>
<body>

<%@include file="customerHeader.jsp" %>

	<form action = "customerBoardWrite.do" class="mb-3" name="myform" id="myform" method="post">
	
		<div align="center" style = "margin-top: 100px;">
			<table>
				<tr>
					<td><input type = "text" name = "writeTitle" size = "52" placeholder="게시글 제목"></td>
				</tr>
				<tr>
					<td><textarea rows="10" cols="50" name = "writeContent" placeholder="게시글 내용을 작성하세요."></textarea></td>
				</tr>
				<tr>
					<td align = "center"><button type = "submit">Write</button></td>
				</tr>
			</table>
		</div>
		
			
	</form>

</body>
</html>