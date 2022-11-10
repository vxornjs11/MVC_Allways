<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="utf-8">
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<%@include file="customerHeader.jsp" %>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Baloo+Tammudu+2:wght@700&display=swap" rel="stylesheet">
<link rel="stylesheet" href="CSS/style.css">
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>슬라이드</title>
  
  <style type="text/css">	
	/* banner */
	.banner {position: relative; width: 1000px; height: 500px; top: 50px;  margin:0 auto; padding:0; overflow: hidden;}
	.banner ul {position: absolute; margin: 0px; padding:0; list-style: none; }
	.banner ul li {float: left; width: 1000px; height: 500px; margin:0; padding:0;}

#page_name{
font-family: 'Baloo Tammudu 2';
font-style: normal;
font-weight: 700;
font-size: 50px;
line-height: 115px;
color: #E75151;
}
</style>

<script type="text/javascript">
	$(document).ready(function() {
		var $banner = $(".banner").find("ul");

		var $bannerWidth = $banner.children().outerWidth();//이미지의 폭
		var $bannerHeight = $banner.children().outerHeight(); // 높이
		var $length = $banner.children().length;//이미지의 갯수
		var rollingId;

		//정해진 초마다 함수 실행
		rollingId = setInterval(function() { rollingStart(); }, 5000);//다음 이미지로 롤링 애니메이션 할 시간차
    
		function rollingStart() {
			$banner.css("width", $bannerWidth * $length + "px");
			$banner.css("height", $bannerHeight + "px");
			//alert(bannerHeight);
			//배너의 좌측 위치를 옮겨 준다.
			$banner.animate({left: - $bannerWidth + "px"}, 3000, function() { //숫자는 롤링 진행되는 시간이다.
				//첫번째 이미지를 마지막 끝에 복사(이동이 아니라 복사)해서 추가한다.
				$(this).append("<li>" + $(this).find("li:first").html() + "</li>");
				//뒤로 복사된 첫번재 이미지는 필요 없으니 삭제한다.
				$(this).find("li:first").remove();
				//다음 움직임을 위해서 배너 좌측의 위치값을 초기화 한다.
				$(this).css("left", 0);
				//이 과정을 반복하면서 계속 롤링하는 배너를 만들 수 있다.
			});
		}
	}); 

</script>
<script type="text/javascript">
function getGender(event) {
	  document.getElementById('result').innerText = 
	    event.target.value;
	}
</script>
</head>

<body>
	<div class="contents">
		<div class="banner">
			<ul>
				<li><img src="./mainImage/mainImage1.png"></li>
				<li><img src="./cakeListImage/allcake02.png"></li>
				<li><img src="./cakeListImage/allcake05.png"></li>
				<li><img src="./cakeListImage/allcake09.png"></li>
				<li><img src="./cakeListImage/allcake19.png"></li>
			</ul>
		</div>
	</div><br><br><br><br><br><br>
	
	<div align="center">
		<h2 id="page_name">Best Cake</h2>
	</div>
  
<div id="testbox" style="width: 1497px;">
	<div class="test">
		<c:forEach items="${bestCakeList}" var="dto">
			<div><a href="customerCakeDetail.do?cakeId=${dto.cakeId}"><img src="./cakeListImage/${dto.cakeImage}" style="padding-left: 20px;"></a></div>
		</c:forEach>
		<c:forEach items="${bestCakeList}" var="dto">
			<div><a href="customerCakeDetail.do?cakeId=${dto.cakeId}"><img src="./cakeListImage/${dto.cakeImage}" style="padding-left: 20px;"></a></div>
		</c:forEach>
		<c:forEach items="${bestCakeList}" var="dto">
			<div><a href="customerCakeDetail.do?cakeId=${dto.cakeId}"><img src="./cakeListImage/${dto.cakeImage}" style="padding-left: 20px;"></a></div>
		</c:forEach>
		<c:forEach items="${bestCakeList}" var="dto">
			<div><a href="customerCakeDetail.do?cakeId=${dto.cakeId}"><img src="./cakeListImage/${dto.cakeImage}" style="padding-left: 20px;"></a></div>
		</c:forEach>
		
     <!--  clone  -->
      
		<c:forEach items="${bestCakeList}" var="dto">
			<div class="clone"><a href="customerCakeDetail.do?cakeId=${dto.cakeId}"><img src="./cakeListImage/${dto.cakeImage}"></a></div>
		</c:forEach>
      
   </div>
</div>
</body>

</html>