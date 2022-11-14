<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리뷰작성 페이지</title>

<link href="/assets/css/star.css" rel="stylesheet"/>
<style>

#button_group {
	width: 115px;
	height: 45px;
	
	font-family: 'Baloo Tammudu 2';
	font-style: normal;
	font-weight: 700;
	font-size: 14px;
	line-height: 32px;
	align-items: center;
	text-align: center;
	
	color: #766262;

	width: 145px;
	height: 55px;
	
	background: #FFFFFF;
	border: 3px solid #FBEAEA;
	border-radius: 70px;
}

</style>
</head>
<body>

<%@include file="customerHeader.jsp" %>

<div align="center" style = "margin-top: 110px">
		<form name = "list" method = "post">
			<table>
				
				<tr>
					<td>
						<a href = "customerWriteList.do"><button type = "button" name = "buttons" id="button_group">BOARD</button></a>&nbsp;
					</td>
					<td>
						<a href = "customerOrdersReview.do"><button type = "button" name = "buttons" id="button_group" onclick = "reviewList();">REVIEW</button></a>&nbsp;
					</td>
					<td>
						<a href = "customerQuestionList.do"><button type = "button" name = "buttons" id="button_group" onclick = "QNA();">Q&A</button></a>
					</td>
				</tr>
				
			</table>
		</form>
	</div>

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