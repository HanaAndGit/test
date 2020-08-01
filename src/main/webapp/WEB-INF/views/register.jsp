<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	label { width: 100px; float: left; }
</style>
<body>
	<h1>Spring Board Register Form</h1>
	<p>Please fill the form below.</p>
	
	<br>
	<form action="register" method="post">
		<p>
			<label>board no</label>
			<input type="text" name="boardno" value="${ boardCnt}" readonly="readonly">
		</p>
		<p>
			<label>board title</label>
			<input type="text" name="boardtitle">
		</p>
		<p>
			<label>writer</label>
			<input type="text" name="boardwriter" value="${loginUser }" readonly="readonly">
		</p>
		<p>board content</p>
		<textarea name="boardcontent" cols="50" rows="7"></textarea>   
		<p>
			<input type="submit" value="register">
		</p>
	</form>
</body>
</html>