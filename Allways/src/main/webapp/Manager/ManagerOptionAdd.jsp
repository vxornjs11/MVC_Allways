<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" 
rel="stylesheet" 
integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" 
crossorigin="anonymous">
<link rel="shortcut icon" href="./images/HeaderLogo2.png" sizes="180x180">
</head>
<body>
<%@include file="managerHeader.jsp"%>
<script type="text/javascript">
function Return(){
		var add = document.add;
		add.action="return.do";
		add.submit();
		}
function previewFile() {
	  var preview = document.querySelector('img#preview');
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


<h1 align="center">옵션 관리</h1>

	<form method="post" action="addOption.do" enctype="multipart/form-data" name = "add">
	<div align="center">
	<table border="0">
	<tr>
	<td>
카테고리 :
	<select name="option">
		<option value="size">size</option>
		<option value="IcingColor">IcingColor</option>
		<option value="BorderColor">BorderColor</option>
		<option value="Flavor">Flavor</option>
		<option value="MassageColor">MassageColor</option>
		<option value="Box">Box</option>
	</select></td>
	<tr>
		<td>CAKE ID :
		<input type="text" name="optionId" readonly/>
		</td>
	</tr>
	
	<tr>
		<td>옵션 이름 :
		<input type="text" name="optionName" >
		</td>
	</tr>
	<tr>
		<td>가격 이름 :
		<input type="text" name="optionPrice"  >
		</td>
	</tr>
	<tr>
		<td>
			<input type="button" value="돌아가기" onclick="Return()">
			<input type="submit" value="추가">
		</td>
	</tr>
	</table>
	</div>
	<div align="left" style="width:74%;display:inline-block">
			<input type="file" name="cakeoptionImage" onchange="previewFile(event)">
		</div>
		<div style="display:inline-block;width:30%;height:50%" align="center">
		<div>
			사진 미리보기
		</div>
		<div>
			<img src="" id="preview" height="200" width="200" style="display:block;margin:20px;border-radius:10px;">
		</div>
	</div>
		
	</form>
		
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" 
crossorigin="anonymous">
</script>
</body>
</html>