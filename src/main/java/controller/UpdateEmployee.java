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

@WebServlet("/update-emp")
public class UpdateEmployee extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String empName = req.getParameter("empname");
		String empAddress = req.getParameter("empaddress");
		LocalDate empdob = LocalDate.parse(req.getParameter("empdob"));
		int id = Integer.parseInt(req.getParameter("empid"));
		
		EmployeeDto dto=new EmployeeDto();
		dto.setEname(empName);
		dto.setEmpaddress(empAddress);
		dto.setEmpdob(empdob);
		dto.setId(id);
		
		EmployeeService service = new EmployeeService();
		service.updateEmployee(dto);
		resp.getWriter().print("<h1 align='center' style='color:green'>Data Updated Success</h1>");
		req.getRequestDispatcher("home.html").include(req, resp);
		
    }
}
