<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World</title>

</head>
<body>

<h2>LIBRARY</h2>
	<p><%=request.getAttribute("messages") %></p>
	
	    <table border="1" cellpadding="5">
        <tr>
        	<th>Id</th>
            <th>Title</th>
            <th>Author</th>
            <th>Genre</th>
            <th>Description</th>
            <th>Publish</th>
            <th>Status</th>
        </tr>

		<c:forEach items="${status}" var="one">
        <tr>
        	<td>${one.getIdget()}</td>
        	<td>${one.getTitleget()}</td>
        	<td>${one.getAuthorget()}</td>
        	<td>${one.getGenreget()}</td>
        	<td>${one.getDescriptionget()}</td>
        	<td>${one.getPublish_dateget()}</td>
        	<td>${one.getStatusget()}</td>
        	
            <%-- <td><%=request.getAttribute("title")%></td>--%>
            <%-- <td><%=request.getAttribute("author")%></td>--%>
            <%-- <td><%=request.getAttribute("status")%></td>--%>
        </tr>
        </c:forEach>
    </table>
    <center>
    
    <form action="BookConfirmServlet">
        <p>Write id number:</p>
        <input type="text" name="id"/>
        <input type="submit" value="OK"/>
	 </form>
	 <p>
	 <form action="AccountServlet">
        <p>Go to you account</p>
        <input type="submit" value="GO"/>
	 </form>
	 </p>
    </center>
</body>
</html>