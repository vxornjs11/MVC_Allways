<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport"
	      content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>단일 파일 업로드</title>
	<script>
	function previewFile() {
		  var preview = document.querySelector('img');
		  var file = document.querySelector('input[type=file]').files[0];
		  var reader = new FileReader();

		  reader.addEventListener(
		    'load',
		    function () {
		      preview.src = reader.result;
		    },
		    false
		  );

		  if (file) {
		    reader.readAsDataURL(file);
		  }
		}
    </script>
</head>
<body style="font-family:'고양체';font-size:1.5em">
<form action="fileUpload.do" name="fileForm" method="post" enctype="multipart/form-data">
	작성자: <input type="text" name="user"><br>
	제목: <input type="text" name="title"><br>
	파일명: <input type="file" id="image" name="uploadFile" onchange="previewFile(event)"/><br>
	<input type="submit" value="파일 업로드">
</form>
<img src="" height="200" alt="이미지 미리보기...">

</body>
</html>