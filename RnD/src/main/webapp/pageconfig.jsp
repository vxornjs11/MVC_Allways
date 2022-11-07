<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="page.do?index=1" method="post">
페이지당 출력되는 행 수: <input type="number" name="rowcount"><br>
전체 데이터 개수: <input type="number" name="size"><br>
<input type="submit" value="확인">
</form>
</body>
</html>