<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<head>
<meta charset="UTF-8">

<title>Insert title here</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
	
	
<meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="Free HTML Templates" name="keywords">
  <meta content="Free HTML Templates" name="description">

   <!-- Favicon -->
<link href="../img/favicon.ico" rel="icon">

<!-- Google Web Fonts -->
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700&display=swap" rel="stylesheet">

<!-- Font Awesome -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">

<!-- Libraries Stylesheet -->
<link href="../lib/animate/animate.min.css" rel="stylesheet">
<link href="../lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
<link href="../lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Baloo+Tammudu+2:wght@700&display=swap" rel="stylesheet">

<!-- Customized Bootstrap Stylesheet -->
<link href="../css/style.css" rel="stylesheet">

<style type="text/css">

  #center {
		padding: 30px 15px;
		font-weight: 400;
		letter-spacing: 1px;
		color: #FF8888;
		outline: none;
		font-family: 'Baloo Tammudu 2';
		font-style: normal;
		font-weight: 400;
		font-size: 19px;
		line-height: 69px;
		display: flex;
   }
  
  #Line{
		position: absolute;
		width: 1337px;
		height: 0px;
		border: 2px solid #FECACA;

	}
  
  .dropdown-toggle::after {
  display: inline-block;
  margin-left: 0.255em;
  vertical-align: 0.255em;
  content: "";
  margin-top: 25px;
  border-top: 0.3em;
  border-right: 0.3em solid transparent;
  border-bottom: 0;
  border-left: 0.3em transparent;
}

.dropdown-item:hover, .dropdown-item:focus {
  color: #F9A392;
  text-decoration: none;
  background-color: #f8f9fa;
}
 
.dropdown-menu {
position: absolute;
  top: 100%;
  left: 0;
  z-index: 1000;
  display: none;
  float: left;
  min-width: 10rem;
  padding: 0.5rem 0;
  margin: 0.125rem 0 0;
  font-size: 1rem;
  color: #757575;
  text-align: center;
  list-style: none;
  background-color: #fff;
  background-clip: padding-box;
  border: 1px rgba(0, 0, 0, 0.15);
}

 
 </style>


<!-- JavaScript Libraries -->
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
<script src="../lib/easing/easing.min.js"></script>
<script src="../lib/waypoints/waypoints.min.js"></script>
<script src="../lib/counterup/counterup.min.js"></script>
<script src="../lib/owlcarousel/owl.carousel.min.js"></script>
<script src="../lib/tempusdominus/js/moment.min.js"></script>
<script src="../lib/tempusdominus/js/moment-timezone.min.js"></script>
<script src="../lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>

<!-- Contact Javascript File -->
<script src="../mail/jqBootstrapValidation.min.js"></script>
<script src="../mail/contact.js"></script>

<!-- Template Javascript -->
<script src="../js/main.js"></script>
    
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<script type="text/javascript">
	function logout() {
		var form = document.loginokay;
		form.action = "customerMain.do";
		sessionStorage.clear();
		form.submit();
		
	}
	
	function mypage(){
		var form=document.loginokay;
		form.action="customerMypage.do";
		form.submit();
	}
</script>

<script type="text/javascript">
function signup() {
	var form=document.loginbtn;
	form.action="http://localhost:8080/Allways/Customer/customerJoin.jsp";
	form.submit();
}</script>


</head>
<body>
	<c:if test="${ID eq null}">
	<div class="container" style="margin-left: 0px; padding-left: 0px; border-left-width: 0px;">
	    <nav class="navbar navbar-expand-lg bg-white navbar-light py-3 py-lg-0 px-lg-5" style="width: 1430px; height: 150px;">
	        <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
	            <span class="navbar-toggler-icon"></span>
	        </button>
	        <div class="collapse navbar-collapse justify-content-between px-lg-3" id="navbarCollapse">
	            <div class="navbar-nav m-auto py-0">
	                <a href="customerMain.do" id="center" class="nav-item nav-link active">HOME</a>
	                <div class="dropdown show">
	                    <a href="#" id="center" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true" style="padding-bottom: 0px;">CAKE</a>
	                    <div class="dropdown-menu" id=".dropdown-menu" style="width: 80px; height: 78px; right: 0px; left: 0px; top: 80px;">
	                        <a href="customerCakeList.do" id="" class="dropdown-item" style="width: 80px;">cake</a>
	                        <a href="#" id="" class="dropdown-item" style="width: 80px;">extras</a>
	                    </div>
	                </div>
	                <a href="#" id="center" class="nav-item nav-link">CLASS</a>
	                <a href="customerWriteList.do" id="center" class="nav-item nav-link">BOARD</a>
	                <a href="customerLocation.do" id="center" class="nav-item nav-link" style="padding-right: 20px;">LOCATION</a>
	                
	                <a href="customerMain.do">
	           		 <img src="./images/HeaderLogo.png" style="padding-right: 230px; padding-left: 90px;"></img>
	            	</a>
	            
	                <a href="customerAbout.do" id="center" class="nav-item nav-link">ABOUT</a>
	                <a href="customerCartList.do" id="center" class="nav-item nav-link">CART</a>
	                
	               <%--  <div class="col-md-4 text-end" style="margin-right: 30px;">
						<%if (session.getAttribute("ID") == null) { %>
							<form name="loginbtn" method="post">
								<input id="center" type="button" class="nav-item nav-link" onclick="login()" value="LOGIN"> 
								<input id="center" type="button" class="nav-item nav-link" onclick="signup()" value="JOIN">
							</form>
						<%} %>
						
						<%if (session.getAttribute("ID") != null) { %>
							<form name="loginokay" method="post" style="position: absolute; right: 0px; top: 30px;">
								<%=session.getAttribute("NAME") %>님, 안녕하세요! 
								<input id="center" type="submit" class="nav-item nav-link" onclick="mypage()" value="마이페이지">
								<input id="center" type="submit" class="nav-item nav-link" onclick="javascript: form.action='CustomerMain.do'" value="로그아웃">
							</form>
						<%} %>
					</div>
	                 --%>
	                	
	                <a href="customerJoin.do" id="center" class="nav-item nav-link">JOIN</a>
	                <a href="customerLoginPage.do" id="center" class="nav-item nav-link">LOGIN</a>
	                
	            </div>
	        </div>
	    </nav>
					 <hr id="Line" style="right: 0px; left: 40px; margin-top: 0px;">
	</div>
	</c:if>
	
	<c:if test="${ID!=null}">
	<div class="container" style="margin-left: 0px; padding-left: 0px; border-left-width: 0px;">
	    <nav class="navbar navbar-expand-lg bg-white navbar-light py-3 py-lg-0 px-lg-5" style="width: 1430px; height: 150px;">
	        <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
	            <span class="navbar-toggler-icon"></span>
	        </button>
	        <div class="collapse navbar-collapse justify-content-between px-lg-3" id="navbarCollapse">
	            <div class="navbar-nav m-auto py-0">
	                <a href="customerMain.do" id="center" class="nav-item nav-link active">HOME</a>
	                <div class="dropdown show">
	                    <a href="#" id="center" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true" style="padding-bottom: 0px;">CAKE</a>
	                    <div class="dropdown-menu" id=".dropdown-menu" style="width: 80px; height: 78px; right: 0px; left: 0px; top: 80px;">
	                        <a href="customerCakeList.do" id="" class="dropdown-item" style="width: 80px;">cake</a>
	                        <a href="#" id="" class="dropdown-item" style="width: 80px;">extras</a>
	                    </div>
	                </div>
	                <a href="#" id="center" class="nav-item nav-link">CLASS</a>
	                <a href="customerWriteList.do" id="center" class="nav-item nav-link">BOARD</a>
	                <a href="customerLocation.do" id="center" class="nav-item nav-link" style="padding-right: 20px;">LOCATION</a>
	                
	                <a href="customerMain.do">
	           		 <img src="./images/HeaderLogo.png" style="padding-right: 250px; padding-left: 90px;"></img>
	            	</a>
	            
	                <a href="customerAbout.do" id="center" class="nav-item nav-link">ABOUT</a>
	                <a href="customerCartList.do" id="center" class="nav-item nav-link">CART</a>
	                
						<%-- <%if (session.getAttribute("ID") == null) { %>
							<form name="loginbtn" method="post">
								<input id="center" type="button" class="nav-item nav-link" onclick="login()" value="LOGIN"> 
								<input id="center" type="button" class="nav-item nav-link" onclick="signup()" value="JOIN">
							</form>
						<%} %>
						 --%>
					<%-- <%=session.getAttribute("NAME") %>님, 안녕하세요!  --%>
					
					<a href="customerMypage.do" id="center" class="nav-item nav-link" onclick="mypage()">MYPAGE</a>
                	<a href="customerLogout.do" id="center" class="nav-item nav-link" onclick="logout()">LOGOUT</a>
	                
	                
			               <!--  <a href="customerJoin.do" id="center" class="nav-item nav-link">JOIN</a>
			                <a href="customerLoginPage.do" id="center" class="nav-item nav-link">LOGIN</a> -->
	                
	            </div>
	        </div>
	    </nav>
					 <hr id="Line" style="right: 0px; left: 40px; margin-top: 0px;">
	</div>
	
	</c:if>


</body>
