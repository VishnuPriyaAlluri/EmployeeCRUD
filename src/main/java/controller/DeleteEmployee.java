package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.EmployeeService;

@WebServlet("/delete-emp")
public class DeleteEmployee extends HttpServlet{
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  int id = Integer.parseInt(req.getParameter("empid"));
	  EmployeeService service = new EmployeeService();
		service.deleteEmp(id);
		
		
		resp.getWriter().print("<h1 align='center' style='color:green'>Data Deleted Success</h1>");
		
		req.getRequestDispatcher("home.html").include(req, resp);
}
}
