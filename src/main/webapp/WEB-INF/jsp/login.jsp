<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ToDO Login</title>
</head>



<body>
     <div style="width:40%;margin:40px;auto">
    <%                      
                    Exception error = (Exception) request.getSession().getAttribute("SPRING_SECURITY_LAST_EXCEPTION");
                   if (error != null)
                    out.write(error.getMessage());
     %>
     
     </div>
    <form method="post" action="/login">
        <div style="margin-top:10px"> Name : <input type="text" name="username" /><br> </div>
        <div style="margin-top:10px">Password : <input type="password" name="password" /> </div>
        <input type="submit" />
    </form>
    </div>
</body>


</html>