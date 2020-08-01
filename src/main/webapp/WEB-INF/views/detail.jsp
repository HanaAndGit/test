<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
	$(function(){
		$("#back").click(function(){
			var cf = confirm("리스트로 돌아가시겠습니까?");
		
			if(cf){
				
				location.href = "gotoboard";
			}
		})
	})
</script>
<style>
	label { width: 100px; float: left; }
</style>

<body>
	<h1>Spring Board Register Form</h1>
	<p>Please fill the form below.</p>
	
	<br>
	
		<p>
			<label>board no</label>
			<input type="text" name="boardno" value="${ board.boardno}" readonly="readonly">
		</p>
		<p>
			<label>board title</label>
			<input type="text" value="${board.boardtitle }" name="boardtitle">
		</p>
		<p>
			<label>writer</label>
			<input type="text" name="boardwriter" value="${board.boardwriter }" readonly="readonly">
		</p>
		<p>board content</p>
		<textarea name="boardcontent" cols="50" rows="7">${board.boardcontent }</textarea>   
		<p>
			<button id="back">back</button>
		</p>

</body>
</html>