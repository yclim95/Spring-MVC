<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Know Your Neighbourhood: View Store</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Name</th>
			<th>Contact Number</th>
			<th>Localities</th>
		</tr>
		
		<!-- Display all store records -->
		<c:forEach var="store"  items="${storeRecords}">
			<tr>
				<td>${store.name}</td>
				<td>${store.phoneNumber}</td>
				<td>
					<c:forEach var="location" items="${store.localities}">
						${location}
					</c:forEach>
				</td>
			</tr>
			
		</c:forEach>
	</table>
	<!-- end of Table -->
</body>
</html>