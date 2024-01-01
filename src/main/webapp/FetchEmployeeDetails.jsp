<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="dto.EmployeeDto"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
            <form>
                     
            </form>
            
     </div>    
</body>
</html>