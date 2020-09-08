<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ToDO Login</title>
<script src="script/jquery-3.5.1.js"></script>
<script src="script/todo.js"></script>
<style type="text/css">
    .centerDiv
    {
    	width: 60%;
      margin: 0 auto;
      
    }
  </style>
  
</head>



<body>
<div class="centerDiv">
<div style="float:right">
	 <a href="<c:url value="/logout" />">Logout</a>
</div>
	<div style="margin-top:40px;font-weight:bold">
    Welcome ${user.firstName},    
    </div>
    
    <div style="margin-top:40px;font-weight:bold">
    TODO List
    </div>
    <div>
    <table style="margin-top:10px;width:100%;border:1px solid black">
    
    <tr style="background-color:#D4E6F1">
    <th>&nbsp;</th>
    <th>Summary</th>
    <th>Description</th>
     <th>Last-Modified Date</th>
     <th>&nbsp;</th>
  </tr>
  <c:choose>
  <c:when test="${user.toDoDetail.size() > 0}">
  <tbody>
  <c:forEach items="${user.toDoDetail}" var="toDoItem" varStatus="loop">
  <tr id="tr_${loop.index}">
  <td>
  <input type="checkbox" id="checkbox_${loop.index}" onclick="showDeleteButton(${loop.index})">
  </td>
  <td>
  ${toDoItem.summary}
  </td>
  
  <td>
  ${toDoItem.description}
  </td>
  <td>
  ${toDoItem.last_modified_date}
  </td>
  <td>
  <input type="button" id="del_button_${loop.index}" value="delete" style="display:none;" onClick="deleteTask(${toDoItem.task_id} , ${loop.index} )"/>
  </td>
  </tr>
  </c:forEach>
  </tbody>
  </c:when>
  <c:otherwise>
    <tr style="background-color:#F5B7B1;text-align:centre">
    <td colspan='5'>
    NO Row Found
    </td>
    </tr>
  </c:otherwise>
  </c:choose>
    
    </table>
    </div>
    <div style="float:right">
    <input type="button" id="add_button" value="Add Your Task" onClick="showToDoForm()"/>
   </div>
   <div id="toDo_div" style="display:none;margin-top:20px;margin-bottom:20px">
   <form method="post" id="todo_form" action="/todo">
   		Summary : <input id="summary" type="text" name="summary" /><br><br><br>
        Description : <input id="desc" type="text" name="description" /><br><br><br>
       <input type="submit" value="Add To MY List"/>
       </form>
   </div>
</body>


</html>