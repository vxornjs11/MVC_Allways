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
<link rel="stylesheet" href="css/Table22.css">
</head>
<body>
<%@include file="managerHeader.jsp"%>
<script type="text/javascript">
var num = /^[0-9]*$/;
document.optionPrice;
function Return(){
		var add = document.add;
		add.action="return.do";
		add.submit();
		}
function CHECKOPTION(){
		var add = document.add;
		
		add.action="ONameCheck.do";
		add.submit();

}
function ADDOPTION() {
		var add = document.add;
			var num = /^[0-9]*$/;
			var pw=add.optionPrice.value;
			if(!num.test(pw)){
				alert("가격은 숫자만 입력 할 수 있습니다.");
				return;
			}
		var Cek = add.ko.value;
		console.log(Cek);
		if(Cek == 1){
			add.action="addOption.do";
			add.method = "post";
			alert("추가가 완료되었습니다");
			add.submit();
			return;
		}else if(Cek == 2){
			alert("사용 불가능한 아이디 입니다.");
			return;
		}else{
			alert("중복체크해주세요");
			return;
		}
		
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

	<form method="post" enctype="multipart/form-data" name = "add">
	<div align="center">
	<table border="0">
	<thead>
	<tr>
	<th>
	카테고리 :
	<select name="option">
		<option value="size">size</option>
		<option value="IcingColor">IcingColor</option>
		<option value="BorderColor">BorderColor</option>
		<option value="Flavor">Flavor</option>
		<option value="MassageColor">MassageColor</option>
		<option value="Box">Box</option>
	</select></th>
	<tr>
		<th>CAKE ID :
		<input type="text" name="optionId" placeholder="자동으로 입력 됩니다." readonly/>
		</th>
	</tr>
	
	<tr>
		<th>옵션 이름 :
			<input type="text" name="optionName" value="${optionName}" >
		<c:if test="${check == null }">
			<th><input type="hidden" name="ko" value="0"/></th></c:if>
		<c:if test="${check == true }"> 
		<br>
				<span style = " font-size:1.0em;  color: red;"> 사용 불가능한 이름 입니다</span>
			<th><input type="hidden" name="ko" value="2"/></th></c:if>
		<c:if test="${check == false }"> 
		<br>
				<span style = " font-size:1.0em;  color:  blue;"> 사용 가능한 이름 입니다</span>
			<th><input type="hidden" name="ko" value="1"/></th></c:if>
		</th>
	</tr>
	<tr>
		<th>가격 이름 :
			<input type="text" name="optionPrice"  value="${optionPrice}" >
		</th>
	</tr>
	<tr>
		<th>
			<input type="button" value="돌아가기" onclick="Return()">
			<input type="button" value="중복체크" onclick="CHECKOPTION()">
			<input type="button" value="추가" onclick="ADDOPTION()">
		</th>
	</tr>
	</thead>
	</table>
	</div>
	<th>
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
	</th>
		
	</form>
		
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" 
crossorigin="anonymous">
</script>
</body>
</html>