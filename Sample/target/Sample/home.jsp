<%@page import="com.eccommerce.Dao" %>
<%@page import="javax.servlet.RequestDispatcher" %>
<%@page import="javax.servlet.http.HttpServlet" %>

<jsp:useBean id="data" class="com.eccommerce.UserData">
</jsp:useBean>
<jsp:setProperty property="*" name="data"/>

<%
int i=Dao.saveData(data);
if(i>0)
{
	out.print("<h2>Your,welcome");
}
else
{
	RequestDispatcher disp=request.getRequestDispatcher("login.jsp");
	disp.include(request,response);
}
%>
