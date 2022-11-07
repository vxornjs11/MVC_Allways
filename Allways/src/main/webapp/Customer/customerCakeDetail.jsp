<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="customerHeader.jsp"%>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Baloo+Tammudu+2:wght@700&display=swap" rel="stylesheet">

<style type="text/css">

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

#cake_name{
font-family: 'Baloo Tammudu 2';
font-style: normal;
font-weight: 600;
font-size: 35px;
line-height: 45px;
text-transform: capitalize;

color: #766262;
}

#cake_option{
font-family: 'Baloo Tammudu 2';
font-style: normal;
font-weight: 600;
font-size: 25px;
line-height: 25px;
text-transform: capitalize;

color: #766262;
}

#cake_optionline{
width: 300px;
height: 0px;

border: 10px solid #FBEAEA;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
</head>
<body>

	<div class="container text-center">
		<div class="row">
			<div class="col"><img alt="" src="./images/About.png"></div>
			<div class="col">
				<div id="cake_name" align="left">
				Cherry Fruits Cake
				</div>
				<div id="cake_name" align="left">
				￦ 52,000
				</div>
				<div>
					<hr>
				</div>
				<div id="cake_option" align="left">
				Shape
				</div>
				<div class="select" align="left">
					<input type="radio" id="shape1" name="shape"><label for="shape1">Circle</label>
					&nbsp;
					<input type="radio" id="shape2" name="shape"><label for="shape2">Rectangle</label>
					&nbsp;
					<input type="radio" id="shape3" name="shape"><label for="shape3">Heart</label>
					&nbsp;
					<input type="radio" id="shape4" name="shape"><label for="shape4">Star</label>
				</div>
				<div id="cake_option" align="left">
				Size
				</div>
				<div class="select" align="left">
					<input type="radio" id="size1" name="size"><label for="size1">Size1</label>
					&nbsp;
					<input type="radio" id="size2" name="size"><label for="size2">Size2</label>
					&nbsp;
					<input type="radio" id="size3" name="size"><label for="size3">Size3</label>
				</div>
				<div id="cake_option" align="left">
				Flavor
				</div>
				<div class="select" align="left">
					<input type="radio" id="flavor1" name="flavor"><label for="flavor1">Size1</label>
					&nbsp;
					<input type="radio" id="flavor2" name="flavor"><label for="flavor2">Size2</label>
					&nbsp;
					<input type="radio" id="flavor3" name="flavor"><label for="flavor3">Size3</label>
				</div>
				<div id="cake_option" align="left">
				Icing Color
				</div>
				<div class="select" align="left">
					<input type="radio" id="icingcolor1" name="icingcolor"><label for="icingcolor1">Size1</label>
					&nbsp;
					<input type="radio" id="icingcolor2" name="icingcolor"><label for="icingcolor2">Size2</label>
					&nbsp;
					<input type="radio" id="icingcolor3" name="icingcolor"><label for="icingcolor3">Size3</label>
				</div>
				<div id="cake_option" align="left">
				Border Color
				</div>
				<div class="select" align="left">
					<input type="radio" id="bordercolor1" name="bordercolor"><label for="bordercolor1">Size1</label>
					&nbsp;
					<input type="radio" id="bordercolor2" name="bordercolor"><label for="bordercolor2">Size2</label>
					&nbsp;
					<input type="radio" id="bordercolor3" name="bordercolor"><label for="bordercolor3">Size3</label>
				</div>
				<div id="cake_option" align="left">
				Lettering Color
				</div>
				<div class="select" align="left">
					<input type="radio" id="letteringcolor1" name="letteringcolor"><label for="letteringcolor1">Size1</label>
					&nbsp;
					<input type="radio" id="letteringcolor2" name="letteringcolor"><label for="letteringcolor2">Size2</label>
					&nbsp;
					<input type="radio" id="letteringcolor3" name="letteringcolor"><label for="letteringcolor3">Size3</label>
				</div>
			</div>
		</div>
	</div>

	<script src="/docs/5.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
		crossorigin="anonymous"></script>
</body>
</html>