<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>Category Information</h1>
		<div class="md-5 lg-5 xs-12">
		<form action="catein" method="post">
			<table>
	            <tr>
	               <td>Name</td>
	               <td><input type="text" class="form-control" id="inName" name="nameC"
							aria-describedy="nameHelp"></td>
	            </tr>
	 
	            <tr>
	               <td>Status </td>
	               <td><input type="checkbox" class="form-control" id="inName" name="statusC"
							aria-describedy="nameHelp"></td>
	            </tr> 
	
	            <tr>
	               <td colspan = "2">
	                  <input type = "submit" value = "Submit"/>
	               </td>
	            </tr>
	         </table>  	
		</form>
		</div>
	</div>
</body>
</html>