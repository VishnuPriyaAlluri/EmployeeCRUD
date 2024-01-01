package controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.EmployeeDto;
import service.EmployeeService;

@WebServlet("/add-emp")
public class AddEmployee extends HttpServlet {
	
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    String name=  req.getParameter("empname");
	   String address=req.getParameter("empaddress");
	   LocalDate dob=LocalDate.parse(req.getParameter("empdob"));
	    
	    
	    EmployeeDto dto=new EmployeeDto();
	    dto.setEname(name);
	    dto.setEmpaddress(address);
	    dto.setEmpdob(dob);
	    
	    EmployeeService service=new EmployeeService();
	    service.saveUser(dto);
	    resp.getWriter().print("<h1 align='center' style='color:green'>Data Added Success</h1>");
		req.getRequestDispatcher("home.html").include(req, resp);
   }
}
