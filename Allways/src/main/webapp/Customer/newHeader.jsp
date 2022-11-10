<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

    <title>header</title>
    
    <link rel="stylesheet"
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
	
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="Free HTML Templates" name="keywords">
    <meta content="Free HTML Templates" name="description">

    <!-- Favicon -->
    <link href="img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700&display=swap" rel="stylesheet">

    <!-- Font Awesome -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="lib/animate/animate.min.css" rel="stylesheet">
    <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
    <link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Baloo+Tammudu+2:wght@700&display=swap" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
    <link href="css/style.css" rel="stylesheet">
    
     <!-- JavaScript Libraries -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
    <script src="lib/easing/easing.min.js"></script>
    <script src="lib/waypoints/waypoints.min.js"></script>
    <script src="lib/counterup/counterup.min.js"></script>
    <script src="lib/owlcarousel/owl.carousel.min.js"></script>
    <script src="lib/tempusdominus/js/moment.min.js"></script>
    <script src="lib/tempusdominus/js/moment-timezone.min.js"></script>
    <script src="lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>

    <!-- Contact Javascript File -->
    <script src="mail/jqBootstrapValidation.min.js"></script>
    <script src="mail/contact.js"></script>

    <!-- Template Javascript -->
    <script src="js/main.js"></script>
    
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

	<style type="text/css">
	
		 #Line{
			position: absolute;
			width: 1337px;
			height: 0px;
			border: 2px solid #FECACA;
		}
	
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
	
	</style>

</head>
<body>

    <!-- Topbar Start -->
   <!--  <div class="container-fluid bg-light d-none d-lg-block">
        <div class="row py-2 px-lg-5">
            <div class="col-lg-6 text-left mb-2 mb-lg-0">
                <div class="d-inline-flex align-items-center">
                    <small><i class="fa fa-phone-alt mr-2"></i>+012 345 6789</small>
                    <small class="px-3">|</small>
                    <small><i class="fa fa-envelope mr-2"></i>info@example.com</small>
                </div>
            </div>
            <div class="col-lg-6 text-right">
                <div class="d-inline-flex align-items-center">
                    <a class="text-primary px-2" href="">
                        <i class="fab fa-facebook-f"></i>
                    </a>
                    <a class="text-primary px-2" href="">
                        <i class="fab fa-twitter"></i>
                    </a>
                    <a class="text-primary px-2" href="">
                        <i class="fab fa-linkedin-in"></i>
                    </a>
                    <a class="text-primary px-2" href="">
                        <i class="fab fa-instagram"></i>
                    </a>
                    <a class="text-primary pl-2" href="">
                        <i class="fab fa-youtube"></i>
                    </a>
                </div>
            </div>
        </div>
    </div> -->
    <!-- Topbar End -->

<!-- Navbar Start -->
    <div class="container-fluid p-0">
        <nav class="navbar navbar-expand-lg bg-white navbar-light py-3 py-lg-0 px-lg-5">
            <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse justify-content-between px-lg-3" id="navbarCollapse">
                <div class="navbar-nav m-auto py-0">
                    <a href="index.html" id="center" class="nav-item nav-link active">HOME</a>
            
           <!--  <a href="index.html" class="navbar-brand ml-lg-3">
                <h1 class="m-0 text-primary"><span class="text-dark">SPA</span> Center</h1>
            </a> -->
            
                    <div class="nav-item dropdown">
                        <a href="#" id="center" class="nav-link dropdown-toggle" data-toggle="dropdown" style="height: 130px;">CAKE</a>
                        <div class="dropdown-menu rounded-0 m-0">
                            <a href="appointment.html" class="dropdown-item">Cake List</a>
                            <a href="testimonial.html" class="dropdown-item">Extras</a>
                        </div>
                    </div>
                    
                    <a href="about.html" id="center" class="nav-item nav-link">CLASS</a>
                    <a href="service.html" id="center" class="nav-item nav-link">BOARD</a>
                    <a href="price.html" id="center" class="nav-item nav-link">LOCATION</a>
                    <a href="" id="center" class="nav-item nav-link" style="width: 30px"></a>
                    
                    <a href="customerMain.do">
	           		 <img src="./images/HeaderLogo.png"></img>
	            	</a>
                    
                    <a href="" id="center" class="nav-item nav-link" style="width: 183.83px;"></a>
                    <a href="contact.html" id="center" class="nav-item nav-link">ABOUT</a>
                    <a href="contact.html" id="center" class="nav-item nav-link">CART</a>
                    <a href="contact.html" id="center" class="nav-item nav-link">JOIN</a>
                    <a href="contact.html" id="center" class="nav-item nav-link">LOGIN</a>
                </div>
                <!-- <a href="" class="btn btn-primary d-none d-lg-block">Book Now</a> -->
            </div>
        </nav>
        	<hr id="Line" style="right: 0px; left: 40px; margin-top: 0px;">
    </div>
    <!-- Navbar End -->
    


   
</body>
</html>