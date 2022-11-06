<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Review Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
rel="stylesheet"
integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
crossorigin="anonymous">

<script type="text/javascript">

</script>

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

#button {

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
	
	background: #FBEAEA;
	border: 3px solid #FBEAEA;
	border-radius: 70px;

}

</style>

</head>
<body>

<%@include file="customerHeader.jsp" %>

	<div align="center">
		<form action = "" method = "post">
			<table>
				
				<tr>
					<td>
						<button id="button_group">NOTICE</button>
						<button id="button_group">REVIEW</button>
						<button id="button_group">FAQ</button>
						<button id="button_group">Q&A</button>
					</td>
				</tr>
				
				<div class="form-check">
					<tr>
						<td>
							<button id="button">Write Review</button>
							
							<input class="form-check-input" type="radio" name="flexRadioDefault" id="labelClick1" checked>
 							<label class="form-check-label" for="labelClick1">
							&nbsp;Newest
							</label>
							
							<input class="form-check-input" type="radio" name="flexRadioDefault" id="labelClick2">
 							<label class="form-check-label" for="labelClick2">
							&nbsp;Star Rating
							</label>
							
							<input class="form-check-input" type="radio" name="flexRadioDefault" id="labelClick3">
							<label class="form-check-label" for="labelClick3">
							 &nbsp;Like
							</label>
						</td>
						
						<td><input type = "text" name = "" size = "20"></td>
						<td><button id="button">Search</button></td>
					</tr>
				</div>
				
				<tr>
					<th>No</th>
					<th>내용</th>
					<th>작성자</th>
					<th>작성일</th>
				</tr>
			
				<tr>
					<td>1</td>
					<td>리뷰입니다.</td>
					<td>나</td>
					<td>2022-11-06</td>
				</tr>
				
			</table>
		</form>
	</div>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
crossorigin="anonymous"></script>
</body>
</html>