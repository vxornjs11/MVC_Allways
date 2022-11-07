<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>옵션</title>
</head>
<body >
<script type="text/javascript">
function SELECT1() {
	var Olist = document.Olist;
	Olist.action="Mselect.do";
	Olist.submit();
	
}
function Addoption(){
		var Olist = document.Olist;
		Olist.action="addList.do";
		Olist.submit();
		}
		
</script>

<%@include file="managerHeader.jsp"%>

<div style="text-align:center"><hr/><h1>옵션</h1><hr/></div>
<div style="text-align:center">
</div>
<div style="text-align:center">
<form name="Olist" method="get">
	<select name="option">
		<option value="">검색 유형</option>
		<option value="cakeoptionId">번호</option>
		<option value="cakeoptionCategory">카테고리</option>
		<option value="cakeoptionValue">옵션</option>
		<option value="cakeoptionPrice">가격</option>
	</select>
	<script type="text/javascript">
	const param__option = '${param.option}';
	if(param__option) {
		$('select[name="param__option"]').val('${param__option}');
	}
	</script>
	<input type="hidden" name ="boardId" value="${param.boardId }"/>
<input value="${param.Query }" type="text" name="Query" size="18">
<input type="button" name="Select" value="검색" onclick="SELECT1()">
<input type="button" name="add" value="추가" onclick="Addoption()">
	<table border="1" align="center" >
		<tr>
			<th>번호</th>
			<th>카테고리</th>
			<th>옵션</th>
			<th>가격</th>
		</tr>	
			<c:forEach items = "${OptionList}" var = "dto">
			
		<tr>
			<td><a href="optionId.do?cakeoptionId=${dto.cakeoptionId}">${dto.cakeoptionId}</a></td>
			<td>${dto.cakeoptionCategory}</td>
			<td>${dto.cakeoptionValue}</td>
			<td>${dto.cakeoptionPrice}</td>
		</tr>
			</c:forEach>
</table>
</form>
</div>
</body>
</html>