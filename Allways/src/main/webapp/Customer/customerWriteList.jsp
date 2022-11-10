<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<style>

#button_group {
	width: 115px;
	height: 45px;
	
	font-family: 'Baloo Tammudu 2';
	font-style: normal;
	font-weight: 700;
	font-size: 14px;
	line-height: 32px;
	align-items: center;
	text-align: center;
	
	color: #766262;

	width: 145px;
	height: 55px;
	
	background: #FFFFFF;
	border: 3px solid #FBEAEA;
	border-radius: 70px;
}

</style>
<script type="text/javascript">

function login() {
	
	var form = document.myform;
	form.action = "customerLoginPage.do";
	form.submit();
	
}

</script>

<title>Insert title here</title>
</head>
<body>

	<%@include file="customerHeader.jsp" %>
	
	<div align="center" style = "margin-top: 110px">
		<form name = "list" method = "post">
			<table>
				
				<tr>
					<td>
						<a href = "customerWriteList.do"><button type = "button" name = "buttons" id="button_group">BOARD</button></a>&nbsp;
					</td>
					<td>
						<a href = "customerOrdersReview.do"><button type = "button" name = "buttons" id="button_group" onclick = "reviewList();">REVIEW</button></a>&nbsp;
					</td>
					<td>
						<a href = ""><button type = "button" name = "buttons" id="button_group">FAQ</button></a>&nbsp;
					</td>
					<td>
						<a href = "customerQuestionList.do"><button type = "button" name = "buttons" id="button_group" onclick = "QNA();">Q&A</button></a>
					</td>
				</tr>
				
			</table>
		</form>
	</div>

	<div style = "margin-left: 250px; margin-top: 100px;">
		
		<form name = "myform" method = "post">
			
			<c:choose>
				<c:when test="${CUSTOMERID != null }">
					<a href = "customerBoardWritePage.do"><button type = "button" style = "margin-left: -130px;" id="write_button">Write Board</button></a>
				</c:when>
				<c:otherwise>
					<button style = "margin-left: -130px;" id="write_button" onclick = "login()">Login</button>
				</c:otherwise>
			</c:choose>
		
			<select style = "margin-left: 720px;" name = "combo">
				<option value = "or_customerId">작성자</option>
				<option value = "oreviewContent">내용</option>
			</select>
			
			<input type = "text" name = "searchContent" size = "20"> &nbsp;
			<button id="search_button" onclick = "searchList()">Search</button>
			
		</form>
	</div>
	
	<div align="center" class="container text-center">
		<form action = "" name = "list" method = "post">
			<table class="table">
				
				<thead>
					<tr>
						<th width="80">No</th>
						<th width="400" style = "text-align: left">제목 + 답글</th>
						<th width="140">작성자</th>
						<th width="140">작성일</th>
					</tr>
				</thead>
				
				<c:forEach var = "dto" items="${writeList }" begin="${(index - 1) * rowcount }" end="${(index) * rowcount - 1}">
					<c:if test="${dto != null }">
						<c:if test="${dto.recommentId == 0 }">
							<tbody>
								<tr>
									<td>${dto.rowNum }</td>
									<td style = "text-align: left"><a href = "customerBoardDetail.do?writeId=${dto.writeId }">${dto.writeTitle }</a></td>
									<td>${dto.w_customerId }</td>
									<td>${dto.writeInitdate }</td>
								</tr>
							</tbody>
						</c:if>
						
						<c:if test="${dto.recommentId == 1 }">
							<tbody>
								<tr>
									<td>&nbsp;&nbsp;&nbsp;↳</td>
									<td style = "text-align: left">${dto.writeContent }</td>
									<td>${dto.w_customerId }</td>
									<td>${dto.writeInitdate }</td>
								</tr>
							</tbody>
						</c:if>
					</c:if>
				</c:forEach>
				
			</table>
		</form>
		
		<div align="center">
		<table>
			<tr align="center" height="20">
				<td>
				
					<c:if test="${index <= 1}">
						[이전] &nbsp;
					</c:if>
				
					<c:if test="${index != 1 }">
						<a href="customerOrdersReview.do?index=${index-1 }&sort=${sort }">이전</a>&nbsp;
					</c:if> 
			
					<c:forEach var="cnt" begin="${pagecount * pagepage + 1}" end="${pagecount * (pagepage + 1)}">
						<c:if test="${cnt <= Math.ceil(arrsize / rowcount)}">
						
							<c:if test="${cnt == index }">
								<a href="customerOrdersReview.do?index=${cnt }&sort=${sort }" style="font-size:1.3em">[${cnt }]</a>
							</c:if>
					
							<c:if test = "${cnt != index }">
								<a href="customerOrdersReview.do?index=${cnt }&sort=${sort }" style="font-size:0.9em">[${cnt }]</a>&nbsp;
							</c:if>
							
						</c:if>
					</c:forEach>
			
					<c:if test="${index >= maxpage }">
						[다음]
					</c:if>
					
					<c:if test="${index < Math.ceil(arrsize / rowcount)}">
						<a href="customerOrdersReview.do?index=${index+1 }&sort=${sort }">다음</a>&nbsp;
					</c:if>
					
				</td>
			</tr>
		</table>
	</div>
		
	</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>

</body>
</html>