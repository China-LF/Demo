<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<body>

<h1>当前在线人数：<%=this.getServletConfig().getServletContext().getAttribute("listener")%></h1>

</body>
</html>
