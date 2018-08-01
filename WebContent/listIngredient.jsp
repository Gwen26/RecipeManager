
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SupCommerce</title>
</head>
<body>

	<table class="table table-striped">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Nom</th>
      <th scope="col">Prix</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${ingredients}" var="i">
			<tr>
				<td><c:out value="${i.name}" /></td>
				<td><c:out value="${i.price}" /></td>
			</tr>
  	</c:forEach>
  </tbody>
		
	</table>
</body>
</html>