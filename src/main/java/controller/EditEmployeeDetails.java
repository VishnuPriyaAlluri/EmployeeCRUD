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

@WebServlet("/edit-details")
public class EditEmployeeDetails extends HttpServlet{
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	 int id=Integer.parseInt(req.getParameter("empid"));
    	
    	 EmployeeDao dao=new EmployeeDao();
    	 EmployeeDto dto = dao.findEMPById(id);
    	 if(dto!=null) {
    	 req.setAttribute("employee",dto);
			req.getRequestDispatcher("EditEmployee.jsp").forward(req, resp);
    	 }else {
    		 resp.getWriter().print("<h1> Invalid Employee Id</h1>");
    	 }
    }
}
