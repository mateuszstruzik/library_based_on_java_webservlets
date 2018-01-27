<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirm book rent</title>
</head>
<body>
Are you sure, to rent this book:

    <table border="1" cellpadding="5">
        <tr>
            <th>Id</th>
            <th>Author</th>
            <th>Title</th>
            <th>Genre</th>
        </tr>

        <tr>
            <td><%=request.getAttribute("IDD")%></td>
            <td><%=request.getAttribute("title")%></td>
            <td><%=request.getAttribute("author")%></td>
            <td><%=request.getAttribute("genre")%></td>
        </tr>
    </table>
    
    <%String id=request.getAttribute("IDD").toString();	
    %>
    <form action="BookListServlet">
     <input type="submit" value="Cancel"/>
     </form>
     
     <form action="UpdateXML">
     <input type="hidden" name="id" value="<%=id%>">
     <input type="submit" value="OK"/>
     </form>
</body>
</html>