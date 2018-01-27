<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Book List</title>
</head>
<body>
	<table>
		<tbody>
			 <%-- <c:forEach items="${list}" var="books"> --%>
				<tr>
					<td><%=request.getAttribute("book1") %></td>
					<td><%=request.getAttribute("book2") %></td>
					
				</tr>
			 <%-- </c:forEach> --%>
		</tbody>
	</table>
	
	  <h3>Book List</h3>
 
    <p style="color: red;">${errorString}</p>
 
    <table border="1" cellpadding="5" cellspacing="1" >
       <tr>
          <th>Id</th>
          <th>Name</th>
          <th>Price</th>
          <th>Edit</th>
          <th>Delete</th>
       </tr>
       <c:forEach items="${books}" var="book" >
          <tr>
             <td>${book.id}</td>
             <td>${book.title}</td>
             <td>${book.author}</td>
             <td>
                <a href="editProduct?code=${book.id}">Edit</a>
             </td>
             <td>
                <a href="deleteProduct?code=${book.id}">Delete</a>
             </td>
          </tr>
       </c:forEach>
    </table>
</body>
</html>