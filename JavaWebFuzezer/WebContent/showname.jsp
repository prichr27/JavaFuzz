<%@page contentType="text/html" %>

<!--

http://www.roseindia.net/jsp

-->

<html>

<body>

<%  
String select = request.getParameter("username");  
String port = request.getParameter("port");   
System.out.println(select);
System.out.println(port);
	
%>  
<p><font size="6">Fuzzme :&nbsp; <%=request.getParameter("username")%></font></p>
<form action="http://localhost:8080/JavaWebFuzezer/Fuzzme" method="get">
 <input type="text" name="address" value="<%=select%>"></input>
 
  <input type="submit" value="FUZZ THIS IP ADDRESS">
  
</form>

</body>

</html>

 