<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="customerHeader.jsp" %>
</head>

	<script type="text/javascript">

	function login(){
		var form = document.customerShowId;
		form.action="customerLoginPage.do";
		form.submit();
	}
	
	</script>
	
<body>

	<form action="customerShowId.do" name="customerShowId" method="post" style="height: 1400px;">
		<div class="container text-center">
			<div class="row">
				<div class="col">
				</div>
				<div class="col">
					<img src="./images/Join.png" id="Join_image"><br>
					<br><h2 id="Join">J O I N</h2><br>
						
						<c:if test="${ID==null}">
							<h2 style="margin:20px">ID를 찾을 수 없습니다.</h2>
						</c:if>
						<c:if test="${ID!=null }">
							<h2>${NAME}께서 가입하신 아이디는 <br>
								${ID}<br>
								입니다.
							</h2>
						</c:if>
						
						
						<br><br>					
					
					<input id="join_button" style="margin-top: 30px" type="button" name="join" value="LOGIN" onclick="login()">	
				</div>
			<div class="col">
			</div>
			</div>
		</div>
	</form>
	
</body>
</html>