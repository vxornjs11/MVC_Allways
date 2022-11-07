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
	padding:1%;
}
</style>
<script>
	function previewFile() {
		  var preview = document.querySelector('img');
		  var file = document.querySelector('input[type=file]').files[0];
		  var reader = new FileReader();

		  reader.addEventListener(
		    'load',
		    function () {
		      preview.src = reader.result;
		    },
		    false
		  );

		  if (file) {
		    reader.readAsDataURL(file);
		  }
		}
    </script>
</head>
<body>
<div align="center">
<form action="addCake.do" method="post" enctype="multipart/form-data">
	<h1 style="margin-bottom:3%;margin-top:3%"><b>케이크 추가</b></h1>
	<div style="display: inline-block;width:60%">
		<div align="left" style="width:20%;display:inline-block">
			케이크 이름
		</div>
		<div align="left" style="width:74%;display:inline-block">
			<div style="width:50%;display:inline-block">
				<input type="text" name="cakeName" class="form-control" style="border-color:#fdcdcd">
			</div>
			<div style="display:inline-block">
				<input type="button" class="btn" style="background:#ffcfcf;border-color:#a87878;color:#a87878" value="중복체크">
			</div>
		</div>
		<div align="left" style="width:20%;display:inline-block">
			가격
		</div>
		<div align="left" style="width:74%;display:inline-block">
			<div style="width:30%;display:inline-block">
				<input type="text" name="cakePrice" class="form-control" style="border-color:#fdcdcd">
			</div>원
		</div>
		<div align="left" style="width:20%;height:20%;display:inline-block">
			메뉴설명
		</div>
		<div align="left" style="width:74%;height:20%;display:inline-block">
			<textarea style="width:100%;margin-top:20px" class="form-control" name="cakeDetail"></textarea>
		</div>
		<div align="left" style="width:20%;display:inline-block">
			사진
		</div>
		<div align="left" style="width:74%;display:inline-block">
			<input type="file" name="cakeImage" onchange="previewFile(event)">
		</div>
	</div>
	<div style="display:inline-block;width:30%;height:50%" align="center">
		<div>
			사진 미리보기
		</div>
		<div>
			<img src="" height="200" width="200" style="display:block;margin:20px;border-radius:10px;">
		</div>
		<div>
			<input type="button" class="btn" style="background:#ffcfcf;border-color:#a87878;color:#a87878" value="취소">
			<input type="submit" class="btn" style="background:#ffcfcf;border-color:#a87878;color:#a87878" value="추가">
		</div>
	</div>
</form>
</div>
</body>
</html>