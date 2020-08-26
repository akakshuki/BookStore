<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category List</title>
</head>
<body>

	<h3>Category List</h3>
	
	<a href="catecreate">Create Books</a>
	<p style="color: red;">${errorString}</p>

	<table border="1" cellpadding="5" cellspacing="1">
		<tr>
<!-- 			<th>IdC</th> -->
			<th>NameC</th>	
			<th>StatusC</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${cates}" var="item">
			<tr>
<%-- 				<td>${item.idc}</td> --%>
				<td>${item.nameC}</td>
				<td>${item.statusC}</td>

				<td><a href="cateup?id=${item.idc}">Edit</a></td>
				<td><a href="cates_del?id=${item.idc}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	

<%-- 	<jsp:include page="AdminFooter.jspf"></jsp:include> --%>

</body>
</html>