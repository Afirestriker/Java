<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!-- Slip16 2. Write a JSP which displays addition of the series 11+13+15+..+29 -->

<%! 
	int seriesAddition(int n1, int n2)
	{
		int sum=0;
		
		while(n1 <= n2)
		{
			sum = sum + n1;
			n1 = n1 +2;
		}
		
		return sum;
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Slip16Q2</title>
</head>
<body>

	<p>Addition of series 11+13+15...+29</p>
	
	<p>Sum: <b> <%= seriesAddition(11, 29) %> </b> </p>

</body>
</html>