<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
div.inln{
width: 20%;
height:20%;
display:inline-block;
background:blue;
margin:10px;
padding:10px;
}
div.basic{
width:50%;
height:100%;
background:yellow;
margin:20px;
border-style:dashed;
border-width:3px;
border-color:magenta;
padding:20px;
display:inline-block;
}
div.box{
display:inline-block;
}
</style>
</head>
<body>
<div>
<div class="basic" align="center">
<div class="inln" align="center">
<span style="background:green;margin:10px">Lorem Ipsum</span>
<div class="inln" style="background:white;padding:10px">hello happy world</div>
</div>
<div class="box" style="width:20%;height:30%;background:blue">hello world</div>
</div>
<div class="box" style="width:70%;">hello world</div>
</div>
</body>
</html>