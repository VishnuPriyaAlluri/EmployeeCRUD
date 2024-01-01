package service;

import dao.EmployeeDao;
import dto.EmployeeDto;

public class EmployeeService {

	public void saveUser(EmployeeDto dto) {
		 EmployeeDao dao=new EmployeeDao();
		dao.saveUser(dto);
	}

	public void deleteEmp(int id) {
		EmployeeDao dao=new EmployeeDao();
		EmployeeDto dto = dao.findEMPById(id);
		if(dto!=null) {
			dao.deleteEMP(dto);
		}
	}

	public void updateEmployee(EmployeeDto dto) {
          EmployeeDao dao=new EmployeeDao();
          dao.updateEmployee(dto);
		
	}

	
      
}
