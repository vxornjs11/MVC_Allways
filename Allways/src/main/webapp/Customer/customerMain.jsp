<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<style>   
.wrap_center{
    width: 100%;
    height: 600px;
}
.container{
    margin: 0 auto;
    width: 600px;
    height: 600px;
    overflow: hidden;
}
.img_wrap{
    width: 600px;
    height: 600px;
    position: absolute;
    overflow: hidden;
}

/* 롤링 이미지 UL */
.rollimgs {
    list-style: none;
    padding: 0;
    margin: 0;
}

.rollimgs li{
    position: absolute;
    width: 600px;
    height: 600px;
    left: 600px;
}
.rollimgs li img{
    width: 100%;
    height: 100%;
}
.rollimgs li.currentroll{
    left: 0;
    transition: left .5s ease-in-out, right .5s ease-in-out;
}
.rollimgs li.prevroll{
    left: -600px;
    transition: left .5s ease-in-out, right .5s ease-in-out;
}
.rollimgs.reverse li.prevroll{
    transition: none;
}
.rollimgs li.nextroll{
    left: 600px;
    display: block;
    transition: none;
}
.rollimgs.reverse li.nextroll{
    transition: left .5s ease-in-out, right .5s ease-in-out;
}
</style>

<script type="text/javascript">
let banner = {
	    rollId: null,
	    interval: 2000,

	    //롤링 배너 초기화
	    rollInit: function (newinterval) {
	        if(parseInt(newinterval) > 0){
	            this.interval = newinterval;
	        }
	        //현재 배너
	        let firstitem = document.querySelector('.rollimgs li');
	        if(firstitem){
	            firstitem.classList.add('currentroll');
	        }
	        //다음 배너
	        let seconditem = document.querySelectorAll('.rollimgs li')[1];
	        if(seconditem){
	            seconditem.classList.add('nextroll');
	        }
	        //이전 배너
	        document.querySelector('.rollimgs li:last-child').classList.add('prevroll');
	        this.rollId = setInterval(this.rollNext, this.interval);//롤링 인터벌 호출
	    },
	    
	    //다음 배너 롤링
	    rollNext: function () {
	        if(document.querySelector('.prevroll')){
	            document.querySelector('.prevroll').classList.remove('prevroll');
	        }
	        if(document.querySelector('.currentroll')){
	            document.querySelector('.currentroll').classList.add('prevroll');
	            document.querySelector('.currentroll').classList.remove('currentroll');
	        }
	        if(document.querySelector('.nextroll')){
	            document.querySelector('.nextroll').classList.add('currentroll');
	            document.querySelector('.nextroll').classList.remove('nextroll');
	        }
	    //다음 이미지 있으면 다음 롤링 이미지로 선택, 없으면 첫번째 이미지를 롤링 이미지로 지정
	        if(document.querySelector('.currentroll').nextElementSibling){
	            document.querySelector('.currentroll').nextElementSibling.classList.add('nextroll');
	        }else{
	            document.querySelector('.rollimgs li').classList.add('nextroll');
	        }
	    }
	}
document.addEventListener('DOMContentLoaded', function(){
    banner.rollInit(4000); // 배너 롤링
});
</script>
<head>
<meta charset="UTF-8">
<title>Main</title>
</head>
<body>

<div class="wrap_center">
    <div class="container">
        <div class="img_wrap">
            <ul class="rollimgs">
                <li><img src="./images/airforce.png"></img></li>
                <li><img src="./images/airjordan.png"></img></li>
                <li><img src="./images/airjordan77.png"></img></li>
                <li><img src="./images/centennial.png"></img></li>
                <li><img src="./images/curry9.png"></img></li>
                <li><img src="./images/hovrsonic.png"></img></li>
                <li><img src="./images/projectrock.png"></img></li>
                <li><img src="./images/superstar.png"></img></li>
            </ul>
        </div>
      </div>
  </div>
</body>
</html>