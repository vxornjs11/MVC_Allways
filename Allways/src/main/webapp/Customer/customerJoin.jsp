<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<script type="text/javascript">
	function selectEmail(ele) {
		var $ele = $(ele);
	    var $email2 = $('input[name=email2]');
	    // '1'인 경우 직접입력
	    if($ele.val() == "1"){
	        $email2.attr('readonly', false);
	        $email2.val('');
	    } else {
	        $email2.attr('readonly', true);
	        $email2.val($ele.val());
	    }
	}
</script>

<script>
    function daum_zipcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var fullAddr = ''; // 최종 주소 변수
                var extraAddr = ''; // 조합형 주소 변수
                // 사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    fullAddr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    fullAddr = data.jibunAddress;
                }
                // 사용자가 선택한 주소가 도로명 타입일때 조합한다.
                if(data.userSelectedType === 'R'){
                    //법정동명이 있을 경우 추가한다.
                    if(data.bname !== ''){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있을 경우 추가한다.
                    if(data.buildingName !== ''){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 조합형주소의 유무에 따라 양쪽에 괄호를 추가하여 최종 주소를 만든다.
                    fullAddr += (extraAddr !== '' ? ' ('+ extraAddr +')' : '');
                }
                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                //document.getElementById("uzip1").value = data.postcode1; //6자리 우편번호 사용
                //document.getElementById("uzip2").value = data.postcode2; //6자리 우편번호 사용
                document.getElementById("uzip").value = data.zonecode; //5자리 기초구역번호 사용
                document.getElementById("uaddr1").value = fullAddr;
                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("uaddr2").focus();
            }
        }).open();
    }
</script>

<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<!-- Viewport -->
<meta name="viewport" content="width=device-width, initial-scale=1" />

<meta name="format-detection" content="telephone=no, address=no, email=no" />

<!-- XEIcon -->
<link rel="stylesheet" href="/assets/fonts/icons/xeicon/xeicon.css?ver=1.015" />

<!-- Masstige Custom Icon for Board Template -->
<link rel="stylesheet" href="/assets/fonts/icons/icomoon/masstige-icons.css?ver=1.015" />

<!-- Google Material Icons -->
<link rel="stylesheet" href="/assets/fonts/icons/material/material-icons.css?ver=1.015" />

<!-- Bootstrap Icons -->
<link rel="stylesheet" href="/assets/fonts/icons/bootstrap/bootstrap-icons.min.css?ver=1.015" />

<!-- Stylesheet -->
<link rel="stylesheet" href="/assets/css/jquery-ui.min.css?ver=1.015" />
<link rel="stylesheet" href="/assets/css/common.min.css?220214v2&ver=1.015" />

<!-- Load jQuery -->
<script src="/assets/js/lib/jquery-1.7.1.min.js"></script>
<!-- update your pre-1.9 jQuery code to jQuery 1.9 up to 3.0 -->
<script src="/assets/js/lib/jquery-migrate-1.4.1.min.js"></script>
<!-- jQuery 3.0 or higher, once you have used Migrate 1.x and upgraded to jQuery 1.9 or higher -->
<!-- <script src="/assets/js/lib/jquery-migrate-3.3.2.min.js"></script>  -->
<!-- mCustomScrollbar 사용시 아래 1.11.1 버전 사용 -->
<!-- <script src="/assets/js/lib/jquery-1.11.1.min.js"></script> -->

<script src="/assets/js/lib/jquery-ui.min.js"></script>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Baloo+Tammudu+2:wght@700&display=swap" rel="stylesheet">

<style type="text/css">	
	#Join{
		font-family: 'Baloo Tammudu 2'; 
		font-style: normal; 
		font-weight: 700;
		font-size: 34px;
		color: #EE3838;
	}
	
	#Join_image{
		padding-top: 70px; 
		padding-left: 0px; 
		padding-bottom: 13px;
	}	
	
	#Line{
		width: 700px;
		height: 0px;
		border: 2px dashed #FF9191;
		
	}
	
	#input_box{
		box-sizing: border-box;
		left: 30px;
		right: 0px;
		width: 350px;
		height: 45px;
		background: #FFFFFF;
		border: 3px solid #FCD5D5;
		padding-left: 10px;
	
	}
	
	#address_box{
		box-sizing: border-box;
		left: 30px;
		right: 0px;
		width: 289px;
		height: 45px;
		background: #FFFFFF;
		border: 3px solid #FCD5D5;
		padding-left: 10px;
	
	}
	
	#email_first{
		box-sizing: border-box;
		left: 30px;
		right: 0px;
		width: 162.3px;
		height: 45px;
		background: #FFFFFF;
		border: 3px solid #FCD5D5;
		padding-left: 10px;
	
	}
	
	#label_design{
		font-family: 'Baloo Tammudu 2';
		font-style: normal;
		font-weight: 600;
		font-size: 18px;
		line-height: 32px;
		display: flex;
		color: #766262;
		margin-bottom: 0px;
		height:25px;
	}	
	
	#radio_design{
		/* Vector */
		width: 32.67px;
		height: 32.67px;
		color: #FCD5D5;

		/* Vector */
		width: 16.33px;
		height: 16.33px;
		color: #FCD5D5;
		
		/* WOMAN */
		font-family: 'Baloo Tammudu 2';
		font-style: normal;
		font-weight: 600;
		font-size: 14px;
		line-height: 32px;
		
		color: #FCD5D5;
		
	}

	#join_button {
		width: 136.55px;
		height: 41.63px;
		background: #FCD5D5;
		border: 2px solid #FCD5D5;
		font-family: 'Baloo Tammudu 2';
		font-style: normal;
		font-weight: 700;
		font-size: 20px;
		color: #FFFDFD;
		line-height: 46px;
	}

</style>

<title>ALLWAYS JOIN</title>
<%@include file="customerHeader.jsp" %>


</head>
<body>
	
	<form action="customerJoin.do" name="customerJoin" method="post" style="height: 1400px;">
		<div class="container text-center">
			<div class="row">
				<div class="col">
				</div>
				<div class="col">
					<img src="./images/Join.png" id="Join_image"><br>
					<br><h2 id="Join">J O I N</h2><br>
					
					<label id="label_design">ID</label>
					<input id="input_box" type="text" name="customerId" size="40" placeholder="영어 소문자와 숫자만 입력 가능"><br><br>
			
					<label id="label_design">PASSWORD</label>
					<input id="input_box" type="password" name="customerPw" placeholder=""><br><br>
					
					<label id="label_design">PASSWORD CHECK</label>
					<input id="input_box" type="password" name="customerPwCheck" placeholder="비밀번호 재입력"><br><br>
					
					<label id="label_design">NAME</label>
					<input id="input_box" type="text" name="customerName"><br><br>
					
					<label id="label_design">GENDER</label>
					<input id="radio_design" type="radio" name="customerGender" value="woman" checked="checked"> WOMAN&nbsp;
					<input id="radio_design" type="radio" name="customerGender" value="man"> MAN<br><br>
					
					<label id="label_design">PHONE</label>
					<input id="input_box" type="text" name="customerPhone" placeholder=" '-' 를 제외하고 숫자만 입력해주세요"><br><br>
					
					<label id="label_design">EMAIL</label>
					<input id="email_first" type="text" name="customerEmail1"> @ <input id="email_first" type="text" name="customerEmail2" placeholder="직접 입력">
						<select id="input_box" name="selectemail" style="margin-top: 5px;" onChange="selectEmail(this)">
							<option value="" selected="selected">선택하세요</option>
							<option value="naver.com">naver.com</option>
							<option value="gmail.com">gmail.com</option>
							<option value="gmail.com">daum.net</option>
							<option value="1">직접 입력</option>
						</select><br><br>
					
					<label id="label_design">BIRTHDAY</label>
					<input id="input_box" type="date" name="customerBirth"><br><br>
					
					<label id="label_design">ADDRESS</label>
					<input type="text" id="address_box" name="uzip" id="uzip" onclick="daum_zipcode()" /> 
					<a href="javascript:daum_zipcode()" name="postcode">우편번호</a><br>
					<input id="input_box" style="margin-top: 5px;" type="text" name="uaddr1" id="uaddr1" title="기본주소" maxlength="200" value="" readonly="" placeholder="기본주소" onclick="daum_zipcode()" /><br>
					<input id="input_box" style="margin-top: 5px;" type="text" name="uaddr2" id="uaddr2" title="상세주소" maxlength="200" value="" readonly="" placeholder="상세주소 입력" /><br><br>
					
					<input id="join_button" style="margin-top: 30px" type="button" name="join" value="JOIN">			
				</div>
			<div class="col">
			</div>
			</div>
		</div>
	</form>
	
	
	
	
			
			
			
			
			
	
	
<script src="/assets/js/lib/jquery-ui.min.js"></script>
<script src="/assets/js/lib/popper.min.js"></script>
<script src="/assets/js/lib/bootstrap.min.js"></script>
<script src="/assets/js/lib/slick.min.js"></script>
<script src="/assets/js/lib/wow.min.js"></script>
<script src="/assets/js/lib/aos.min.js"></script>
<script src="/assets/js/lib/jquery.magnific-popup.min.js"></script>
<!-- fullpage에서 scrollOverflow 옵션 사용 시 선언 -->
<!-- <script src="/assets/js/lib/scrolloverflow.min.js"></script> -->
<!-- css3:false 옵션 적용 후 "linear", "swing" 또는 "easeInOutCubic" 대신 다른 easing 효과 사용 시  선언-->
<!-- <script src="/assets/js/lib/easings.min.js"></script>
<script src="/assets/js/lib/fullpage.min.js"></script> -->
<script src="/assets/js/lib/swiper.min.js"></script>
<script src="/assets/js/lib/jquery.scrollbar.min.js"></script>
<script src="/assets/js/lib/jquery.mCustomScrollbar.min.js"></script>
<script src="/assets/js/lib/paper-full.min.js"></script>
<!-- <script src="/assets/js/lib/jquery.rwdImageMaps.min.js"></script> 이미지맵 반응형 플러그인 -->

<!-- for Board Template-->
<script src="/assets/js/custom/clipboard.js"></script>

<!-- Custom Library -->
<script src="/assets/js/custom/nav_active-1.1.6.masstige.min.js"></script>
<script src="/assets/js/custom/tab-1.1.0.masstige.js"></script>
<script src="/assets/js/custom/resizingCheck-1.0.0.masstige.js"></script>
<!-- <script src="/assets/js/custom/fullpage.coverflow.masstgie.js"></script>  사용시에만 주석 해제 -->
<script src="/assets/js/custom/nav_drop-1.0.1.masstige.min.js"></script>
<script src="/assets/js/custom/scroll_track-1.0.1.masstige.min.js"></script>
<!-- <script src="/assets/js/custom/wow.masstige.js"></script>  -->
<!-- wow.masstige.js : wow reinit -->

<!-- COMMON -->
<script src="/assets/js/common.js"></script>
<script src="/js/other.js?ver=1.0408"></script>
<script src="/js/pg_common.js?ver=1.0408"></script>
<script src="/js/orderform.js?ver=1.0408"></script>
<script src="/lib/mall/order.js?ver=1.0408"></script>


<script type="text/javascript">
<script
src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
	
</body>
</html>