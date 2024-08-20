<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sum of two numbers</title>
</head>
<body>
	<form name="NewFile" method="submit">
		Enter First Number : <input type="text" name="n1"><br>
		Enter Second Number : <input type="text" name="n2"><br> <input
			type="submit" value="Find Sum">
	</form>
	<%!int findSum(int a, int b) {
		return a + b;
	}%>
	<%
	String inp1 = request.getParameter("n1");
	String inp2 = request.getParameter("n2");
	if ((inp1 != null) && (inp2 != null)) {
		int a = Integer.parseInt(inp1);
		int b = Integer.parseInt(inp2);

		int sum = findSum(a, b);
		out.println("<br>Sum = " + sum);
	}
	%>

</body>
</html>