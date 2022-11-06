<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>케이크 추가</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="managerstyle.css">
<style>
div{
	border:solid;
	border-width:1px;
	padding:3%;
}
</style>
</head>
<body>
<form action="#" method="post">
<div align="center">
	<h1 style="margin-bottom:3%;margin-top:3%"><b>케이크 추가</b></h1>
	<div style="display: inline-block;width:60%">
		<div align="left" style="width:20%;display:inline-block">
			케이크 이름
		</div>
		<div align="left" style="width:74%;display:inline-block">
			<div style="width:50%">
				<input type="text" name="menuname" class="form-control">
			</div>
		</div>
		<div align="left" style="width:20%;display:inline-block">
			맛
		</div>
		<div align="left" style="width:74%;display:inline-block">
			<div style="width:30%">
				<select name="flavor" class="form-select">
					<c:forEach var="cnt" begin="1" end="10">
						<option value="딸기">딸기</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<div align="left" style="width:20%;display:inline-block">
			사이즈
		</div>
		<div align="left" style="width:74%;display:inline-block">
			<div style="width:30%">
				<select name="flavor" class="form-select">
					<c:forEach var="cnt" begin="1" end="3">
						<option value="딸기">${cnt }호</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<div align="left" style="width:94%;display:inline-block">
			메뉴설명<br>
			<textarea style="width:100%;margin-top:20px" class="form-control"></textarea>
		</div>
	</div>
	<div style="display:inline-block;width:30%;height:50%">
		사진 미리보기
		<img src="" height="200" alt="이미지 미리보기..." style="display:block;margin:20px">
	</div>
</div>
</form>
</body>
</html>