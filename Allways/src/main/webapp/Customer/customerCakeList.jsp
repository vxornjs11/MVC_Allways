<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cake List</title>
<%@include file="customerHeader.jsp"%>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Baloo+Tammudu+2:wght@700&display=swap" rel="stylesheet">
<style>

.select {
    padding: 15px 10px;
}
.select input[type=radio]{
    display: none;
}
.select input[type=radio]+label{
    display: inline-block;
    cursor: pointer;
    height: 24px;
    width: 90px;
    border: 1px solid #FBEAEA;
    line-height: 24px;
    text-align: center;
    font-weight:bold;
    font-size:13px;
	font-family: 'Baloo Tammudu 2';
	font-style: normal;
    color: #766262;
}
.select input[type=radio]+label{
    background-color: #fff;
    color: #333;
    border-radius: 70px;
}
.select input[type=radio]:checked+label{
    background-color: #FBEAEA;
    color: #333;
}
</style>
</head>
<body>

	<main>
	
 <div class="select">
     <input type="radio" id="select" name="shop"><label for="select">SORT1</label>
     <input type="radio" id="select2" name="shop"><label for="select2">SORT2</label>
     <input type="radio" id="select3" name="shop"><label for="select3">SORT3</label>
</div>

		<div class="row">
			
			<c:forEach items="${cakeList}" var="dto">
				<div class="col-lg-2 col-md-4">
					<div class="card" style="width: 14rem;">
					<a href="cakeDetail.do?cakeName=${dto.cakeName}">
						<img src="./cakeListImage/${dto.cakeImage}" class="card-img-top"
							alt="${dto.productmodel}">
					</a>
						<div class="card-body">
							<p class="card-text" align="center">${dto.cakePrice}</p>
							<p class="card-text" align="center">${dto.cakeLike} ${dto.cakeViews}</p>
						</div>
					</div>
				</div>
			</c:forEach>
			
			<c:forEach items="${productListCategory}" var="dto">
				<div class="col-lg-2 col-md-4">
					<div class="card" style="width: 14rem;">
					<a href="productDetail.do?productmodel=${dto.productmodel}">
						<img src="./productListImage/${dto.productmodel}.png" class="card-img-top"
							alt="${dto.productmodel}" style="max-height:100">
					</a>
						<div class="card-body">
							<p class="card-text" align="center">${dto.productbrand} ${dto.productmodel}</p>
							<p class="card-text" align="center">${dto.productprice}</p>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>

	</main>

	<script src="/docs/5.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
		crossorigin="anonymous"></script>
</body>
</html>