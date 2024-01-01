package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import dto.EmployeeDto;
import service.EmployeeService;

@WebServlet("/fetch-details")
public class FetchEmplyee extends HttpServlet{
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   int id = Integer.parseInt(req.getParameter("empid"));
	   EmployeeDao dao=new EmployeeDao();
  	 EmployeeDto dto = dao.findEMPById(id);
  	 if(dto!=null) {
  	resp.getWriter().print("<h1> Employee Name :"+dto.getEname()+"</h1>");
  	resp.getWriter().print("<h1> Employee Name :"+dto.getEmpaddress()+"</h1>");
  	resp.getWriter().print("<h1> Employee Name :"+dto.getEmpdob()+"</h1>");
  	 }else {
  		resp.getWriter().print("<h1> Invalid Employee Id</h1>");
  	 }
  	
//  	 req.setAttribute("employee",dto);
//	req.getRequestDispatcher("FetchEmployeeDetails.jsp").forward(req, resp);	
  	 
}
}
