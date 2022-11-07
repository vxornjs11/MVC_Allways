<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="managerHeader.jsp"%>
<script type="text/javascript">

function Return(){
		var add = document.add;
		add.action="return.do";
		add.submit();
		}
function Update(){
		var add = document.add;
		add.action="Update.do";
		add.submit();
		}

</script>


<h1 align="center">옵션 관리</h1>

	<form method="get" action="addOption.do" name = "add">
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
		<input type="text" name="optionId" value="${cake_option.cakeoptionId}">
		</td>
	</tr>
	
	<tr>
		<td>옵션 이름 :
		<input type="text" name="optionName" value="${cake_option.cakeoptionValue}" >
		</td>
	</tr>
	<tr>
		<td>가격 이름 :
		<input type="text" name="optionPrice" value="${cake_option.cakeoptionPrice}" >
		</td>
	</tr>
	<tr>
		<td>
			<input type="button" value="취소" onclick="Return()">
			<input type="button" value="수정" onclick="Update()">
			<input type="submit" value="추가">
		</td>
	</tr>
	</table>
		
	</form>
</body>
</html>