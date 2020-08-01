<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	h1 { width: 300px; height: 50px; margin: 0 auto;}
	form { width: 300px; height:200px; margin: 0 auto; 
		   border: 2px solid goldenrod; padding: 10px; 
		   }
	form label { width: 100px; float: left; }
	form #j { text-align: center;}
</style>
<body>
	<h1>커뮤니티 회원 가입</h1>
	<form action="join" method="post">
		<p>
			<label>회원 번호</label>
			<input type="text" name="userno" readonly="readonly" value="${userCnt }">
		</p>
		<p>
			<label>회원 이름</label>
			<input type="text" name="username">
		</p>
		<p>
			<label>아이디</label>
			<input type="text" name="userid">
		</p>
		<p>
			<label>비밀번호</label>
			<input type="text" name="userpw">
		</p>
		<p id="j">
			<input type="submit" value="join">
		</p>
	</form>
</body>
</html>