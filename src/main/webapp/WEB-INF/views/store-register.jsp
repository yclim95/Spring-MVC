<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
	
	<title>Know Your Neighbourhood: Register Store</title>
</head>
<body>
	<form:form method="POST" action="registerStore" modelAttribute="store">
		<table>
			<tr>
				<td>Name: </td>
				<td><form:input path="name" /></td>
			</tr>
			
			<tr>
				<td>Contact Number: </td>
				<td><form:input path="phoneNumber" /></td>
			</tr>
			
			<tr>
				<td>Localities: </td>
				<td><form:input path="localities" /></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Submit"/></td>
			</tr>
			
		</table>
	</form:form>
</body>
</html>