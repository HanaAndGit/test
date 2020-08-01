<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<style>
	h1 { width: 300px; height: 50px; margin:0 auto; text-align : center; line-height: 50px; }
	form#loginBox { width: 300px; height: 150px; border: 2px solid skyblue; 
					margin: 0 auto; text-align: center; line-height: 30px; }
</style>
<body>
<c:if test="${success != null }">
	<script>
		alert("login!");
	</script>
</c:if>
<c:if test="${joinSuccess != null }">
	<script>
		alert("you successfully joined!");
	</script>
</c:if>
<h1>Spring Community</h1>

<c:if test="${success == null }">
	<form id="loginBox" action="login" method="post">
		<p>
			<label>ID</label>
			<input placeholder="please type id here" name="userid">
		</p>
		<p>
			<label>PW</label>
			<input type="password" placeholder="please type password here" name="userpw">
		</p>
		<p>
			<input type="submit" value="login">
			<a href="join">join</a>
		</p>
	</form>
</c:if>
<c:if test="${success != null }">
	<a href="gotoboard">go to the board</a>
</c:if>
</body>
</html>
