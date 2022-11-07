<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>슬라이드</title>
  <link rel="stylesheet" href="CSS/style.css">
</head>

<body>
  <div id="slideShow">
    <ul class="slides">
      <li><img src="image/flower.jpg" alt=""></li>
      <li><img src="image/fox.jpg" alt=""></li>
      <li><img src="image/lightning.jpg" alt=""></li>
      <li><img src="image/moon.jpg" alt=""></li>
      <li><img src="image/nature.jpg" alt=""></li>
      <li><img src="image/space.jpg" alt=""></li>
    </ul>
    <p class="controller">
      <!-- &lang: 왼쪽 방향 화살표 &rang: 오른쪽 방향 화살표 --> 
      <span class="prev">&lang;</span> 
      <span class="next">&rang;</span>
    </p>
  </div>
  <script src="JS/slideShow.js"></script>
  
<div id="testbox">
   <div class="test">
      <div><a href="https://google.com"><img src="https://unsplash.it/330/200/?random=1" /></a></div>
      <div><img src="https://unsplash.it/330/200/?random=2" /></div>
      <div><a href="https://google.com"><img src="https://unsplash.it/330/200/?random=3" /></a></div>
      <div><img src="https://unsplash.it/330/200/?random=4" /></div>
      <div><img src="https://unsplash.it/330/200/?random=5" /></div>
      <div><img src="https://unsplash.it/330/200/?random=6" /></div>
      <div><img src="https://unsplash.it/330/200/?random=7" /></div>
      <div><img src="https://unsplash.it/330/200/?random=8" /></div>
      <!--   clone     -->
      <div class="clone"><img src="https://unsplash.it/330/200/?random=1" /></div>
      <div class="clone"><img src="https://unsplash.it/330/200/?random=2" /></div>
      <div class="clone"><img src="https://unsplash.it/330/200/?random=3" /></div>
      <div class="clone"><img src="https://unsplash.it/330/200/?random=4" /></div>
      <div class="clone"><img src="https://unsplash.it/330/200/?random=5" /></div>
      <div class="clone"><img src="https://unsplash.it/330/200/?random=6" /></div>
      <div class="clone"><img src="https://unsplash.it/330/200/?random=7" /></div>
      <div class="clone"><img src="https://unsplash.it/330/200/?random=8" /></div>
   </div>
</div>
</body>

</html>