
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	h1 { width: 300px; height: 50px; margin: 0 auto; }
	p { width: 300px; height: 50px; margin: 0 auto; }
	a#register { display: block; width: 700px; margin: 0 auto;}
	table { border-collapse : collapse; width: 700px; margin: 0 auto; }
	tr, th, td { border: 1px solid #000; text-align: center; }
	th { width: 100px; }
</style>
<script>

$(function(){
	/* $("#detail").click(function(){
		alert("click");
		var no = $(this).parent().find("#no");
		console.log(no);
		location.href = "${pageContext.request.contextPath}/detail?no="+no;
	})	 */
})
</script>
<body>
	<h1>Spring Board</h1>
	<p>Please leave your opinion here</p>
	
	<br>
	<a href="register" id="register">Register</a>
	<br>
	<table>
		<tr>
			<th>No</th>
			<th>title</th>
			<th>writer</th>
			<th>date</th>
			<th>management</th>
		</tr>
		
		<c:forEach items="${list }" var="b">
			<tr>
				<td id="no">${b.boardno }</td>
				<td><a href="${pageContext.request.contextPath}/detail?no=${b.boardno}" id="detail">${b.boardtitle }</a></td>
				<td>${b.boardwriter }</td>
				<td><fmt:formatDate value="${b.boarddate }" pattern="yyyy-MM-dd"/></td>
				<td>
					<button>Edit</button>	
					<button>Delete</button>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>