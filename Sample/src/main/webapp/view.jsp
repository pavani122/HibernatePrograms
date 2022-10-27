<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="com.eccommerce.UserData"%>
<%@page import="com.eccommerce.Dao" %>
<%@page import="java.util.List"%>
<%@page import="java.util.*" %>
<a href="login.jsp">ClickToRegister</a>
<%
ArrayList<UserData> list=new ArrayList<>();
List<UserData> list1=Dao.getData(list);
for(UserData u:list1)
{
	String name=u.getUserName();
	String email=u.getEmail();
	String password=u.getPassword();
	
}
%>
<html>
<body>
<table border="2">
<tr>
<th>Name</th><th>Email</th><th>Password</th></tr>
<tr>
<td><%="name" %></td>
<td><%="email" %></td>
<td><%="password" %></td>
</tr>
</table>
</body>
</html>
