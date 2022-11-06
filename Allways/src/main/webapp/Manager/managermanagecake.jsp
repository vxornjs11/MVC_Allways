<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>케이크 관리</title>
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
<form action="#" method="post">
	<h1 style="margin-bottom:3%;margin-top:3%"><b>케이크 관리</b></h1>
	<div style="display: inline-block;width:60%">
		<div align="left" style="width:20%;display:inline-block">
			케이크 이름
		</div>
		<div align="left" style="width:74%;display:inline-block">
			<div style="width:50%;display:inline-block">
				<input type="text" name="menuname" class="form-control" style="border-color:#fdcdcd">
			</div>
			<div style="display:inline-block">
				<input type="button" class="btn" style="background:#ffffff;border-color:#a87878;color:#a87878" value="중복체크">
			</div>
		</div>
		<div align="left" style="width:20%;display:inline-block">
			가격
		</div>
		<div align="left" style="width:74%;display:inline-block">
			<div style="width:30%;display:inline-block">
				<input type="text" name="menuprice" class="form-control" style="border-color:#fdcdcd">
			</div>원
		</div>
		<div align="left" style="width:20%;display:inline-block">
			맛
		</div>
		<div align="left" style="width:74%;display:inline-block">
			<div style="width:30%">
				<select name="flavor" class="form-select" style="border-color:#fdcdcd">
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
				<select name="size" class="form-select" style="border-color:#fdcdcd">
					<c:forEach var="cnt" begin="1" end="3">
						<option value="딸기">${cnt }호</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<div align="left" style="width:20%;height:20%;display:inline-block">
			메뉴설명
		</div>
		<div align="left" style="width:74%;height:20%;display:inline-block">
			<textarea style="width:100%;margin-top:20px" class="form-control"></textarea>
		</div>
		<div align="left" style="width:20%;display:inline-block">
			사진
		</div>
		<div align="left" style="width:74%;display:inline-block">
			<input type="file" name="cakeviews" onchange="previewFile(event)">
		</div>
	</div>
	<div style="display:inline-block;width:30%;height:50%" align="center">
		<div>
			사진 미리보기
		</div>
		<div>
			<img src="" height="200" width="200" style="display:block;margin:20px;border-radius:10px">
		</div>
		<div>
			<input type="button" class="btn" style="background:#ffffff;border-color:#a87878;color:#a87878" value="취소">
			<input type="button" class="btn" style="background:#ffffff;border-color:#a87878;color:#a87878" value="삭제">
			<input type="submit" class="btn" style="background:#ffffff;border-color:#a87878;color:#a87878" value="수정">
		</div>
	</div>

</form>
</div>
</body>
</html>