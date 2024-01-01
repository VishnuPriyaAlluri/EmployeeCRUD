<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="dto.EmployeeDto"%>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Employee</title>
<style>
div {
	display: flex;
	flex-direction: column;
	align-items: center;
	justify-content: center;
}
</style>
</head>
<body>
      <div>
      <%EmployeeDto dto=(EmployeeDto)request.getAttribute("employee"); %>
      <h1>Edit Employee</h1>
      <form action="update-emp">
              <fieldset>
                       <legend>Enter Task here</legend>
                       <input type="hidden" name="empid" value="<%=dto.getId()%>">
                       EmployeeName :<input type="text" value="<%=dto.getEname()%>" name="empname"><br/><br/>
                       EmployeeAddress :<input type="text" value="<%=dto.getEmpaddress()%>" name="empaddress"><br/><br/>
                       EmployeeDOB :<input type="date" value="<%=dto.getEmpdob()%>" name="empdob"><br/><br/>
                       <button>Update</button><br/><br/>
                       <button type="reset">Cancel</button><br/><br/>
                       <a href="home.html"><button>Back</button></a>
              </fieldset>
      </form>
      </div>
      
</body>
</html>