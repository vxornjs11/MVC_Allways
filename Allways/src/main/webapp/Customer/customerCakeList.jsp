<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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

#cakeList{
font-family: 'Baloo Tammudu 2';
font-style: normal;
font-weight: 600;
font-size: 17px;
line-height: 32px;
text-align: center;
text-transform: capitalize;
color: #766262;
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

		<div class="row" style="padding-left: 35px; margin-right: 0px;">
			
			<c:forEach items="${cakeList}" var="dto">
				<div class="col-lg-3 col-md-6" style="padding-bottom: 20px;" id="cakeList">
					<div class="card" style="width: 20rem;">
					<a href="customerCakeDetail.do?cakeId=${dto.cakeId}">
						<img src="./cakeListImage/${dto.cakeImage}" class="card-img-top"
							alt="${dto.cakeId}">
					</a>
						<div class="card-body">
							<table>
								<tr>
									<td align="left" width="170px">${dto.cakeName}</td><td align="right" width="120px">￦ <fmt:formatNumber value="+${dto.cakePrice}"/></td>
								</tr>
								<tr>
									<td align="left">&hearts; ${dto.cakeLike}</td><td align="right">Views ${dto.cakeViews}</td>
								</tr>
							</table> 						
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