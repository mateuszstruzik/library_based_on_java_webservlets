<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<center>
		<h1>Add Book Details</h1>

		<form action="addBookServlet" method="post" onsubmit="redirect(this);">
			<!--  action - gdzie wysylamy formularz -->
			<input name="title" placeholder="title" type="text"> <input
				name="author" placeholder="author" type="text"> <input
				name="genre" placeholder="genre" type="text"> <input
				name="status" placeholder="status" type="text"> <input
				name="description" placeholder="description" type="text"> <input
				type="submit" value="Dalej">
		</form>
	</center>

	<script>
		function redirect(elem) {
			elem.setAttribute("action", "ShowAll.jsp");
			elem.submit();
		}
	</script>




</body>
</html>