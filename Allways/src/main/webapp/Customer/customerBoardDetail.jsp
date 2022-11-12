<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

#title {
	text-align: left;
}

</style>
</head>
<body>

<script type="text/javascript">

function writeComment(index) {
	var form = document.myform;
	if (index == 1) {
		form.method = "post";
		form.action = "customerWriteComment.do";
	}
	form.submit();
}

</script>

	<%@include file="customerHeader.jsp" %>

	<br>
	
	<table>
		<tr>
			<th width = "50">
			<th width="50" style = "text-align: left"><h6>No.${boardDetail.writeId}</h6></th>
			<th width="110" style = "text-align: left"><h6>작성자: ${boardDetail.customerName}</h6></th>
			<th width="300" style = "text-align: left"><h6>제목: ${boardDetail.writeTitle}</h6></th>
			<th width="850" style = "text-align: right"><h6>작성일자: ${boardDetail.writeInitdate}</h6></th>
		</tr>
	</table>
	
	<br>
	
	<div align="center">
		<textarea rows="10" cols="70">${boardDetail.writeContent}</textarea>

		<table>
		
			<c:choose>
			
				<c:when test="${boardlength == 0 }">
					<h5>작성한 답글이 없습니다.</h5>
				</c:when>
				
				<c:otherwise>
					<c:forEach var = "dto" items="${boardComment }">
					
						<c:choose>
							<c:when test="${dto.distinguish == 2 }">
								<c:choose>
									<c:when test="${CUSTOMERID == dto.w_customerId }">
										<tbody>
									        <tr>
									          <td width="300">↳ ${dto.writeContent }</td>
									          <td width="110">${dto.customerName }</td>
									          <td width="120">${dto.writeInitdate }</td>
									          <td><a href = "customerBoardReCommentDelete.do">X</a></td>
									        </tr>
								      </tbody>
									</c:when>
									
									<c:otherwise>
										<tbody>
									        <tr>
									          <td width="300">↳ ${dto.writeContent }</td>
									          <td width="110">${dto.customerName }</td>
									          <td width="120">${dto.writeInitdate }</td>
									        </tr>
								      </tbody>
									</c:otherwise>
								</c:choose>
							</c:when>
							
							<c:otherwise>
								<c:choose>
									<c:when test="${CUSTOMERID == dto.w_customerId }">
										<tbody>
									        <tr>
									          <td width="300">${dto.writeContent }</td>
									          <td width="110">${dto.customerName }</td>
									          <td width="120">${dto.writeInitdate }</td>
									          <td><a href = "">X</a></td>
									        </tr>
								      </tbody>
									</c:when>
									
									<c:otherwise>
										<tbody>
									        <tr>
									          <td width="300">${dto.writeContent }</td>
									          <td width="110">${dto.customerName }</td>
									          <td width="120">${dto.writeInitdate }</td>
									        </tr>
								     	</tbody>
									</c:otherwise> 
								</c:choose>
							</c:otherwise>
							
						</c:choose>
						
					</c:forEach>
				</c:otherwise>
				
			</c:choose>
			
				
		</table>
		<br>
		<form action = "customerWriteComment.do" name = "myform" method = "post">
			<input type = "hidden" name = "writeId" value = "${boardDetail.writeId}">
			<input type = "text" name = "writeContent" size = "65" placeholder="답글 작성란">
			<button type = "submit">OK</button>
		</form>
		
	</div>
</body>
</html>