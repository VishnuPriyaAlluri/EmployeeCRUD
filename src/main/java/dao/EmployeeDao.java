package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dto.EmployeeDto;

public class EmployeeDao {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev"); 
    EntityManager manager=factory.createEntityManager();
	public void saveUser(EmployeeDto dto) {
		manager.getTransaction().begin();
    	manager.persist(dto);
    	manager.getTransaction().commit(); 		
	}
	public EmployeeDto findEMPById(int id) {
		return manager.find(EmployeeDto.class, id);		
	}
	public void deleteEMP(EmployeeDto dto) {
		manager.getTransaction().begin();
		manager.remove(dto);
		manager.getTransaction().commit();		
	}
	public void updateEmployee(EmployeeDto dto) {
		manager.getTransaction().begin();
		manager.merge(dto);
		manager.getTransaction().commit();
		
	}
		
	
}
