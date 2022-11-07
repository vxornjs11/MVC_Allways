<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
a{
color:black;
text-decoration:none;
background:yellow;
}
</style>
<body>
<div align="center">
<table border="1">
<c:forEach var="cnt" items="${arr }" begin="${(index-1)*rowcount }" end="${(index)*rowcount-1}">
<c:if test="${cnt!=null }">
<tr>
<td> ${cnt }</td>
</tr>
</c:if>
</c:forEach>
</table>
<!-- 페이지 표시 -->
<a href="page.do?index=1">처음으로</a>
<c:if test="${index!=1 }">
<a href="page.do?index=${index-1 }">이전</a>
</c:if>
<!--  
<c:if test="${index/pagecount>=0 }">
<a href="page.do?pagepage=${pagepage-1}">이전 페이지</a>
</c:if>
-->
<!-- 페이지 숫자 -->
<c:forEach var="cnt" begin="${pagecount*pagepage+1}" end="${ pagecount*(pagepage+1) }">
<c:if test="${cnt<=Math.ceil(arrsize/rowcount) }">
<c:if test="${cnt==index }">
<span style="display:inline">
<a href="page.do?index=${cnt }" style="font-size:1.3em">${cnt }</a>
</span>
</c:if>
<c:if test="${cnt!=index }">
<a href="page.do?index=${cnt }" style="font-size:0.9em">${cnt }</a>
</c:if>
</c:if>
</c:forEach>
<c:if test="${index<Math.ceil(arrsize/rowcount) }">
<a href="page.do?index=${index+1 }">다음</a>
</c:if>
<!--  
<c:if test="${index/pagecount<=Math.ceil(arrsize/pagecount) }">
<a href="page.do?pagepage=${pagepage+1 }">다음 페이지</a>
</c:if>
-->
<a href="page.do?index=${Math.ceil(arrsize/rowcount) }">끝으로</a>
</div>
</body>
</html>