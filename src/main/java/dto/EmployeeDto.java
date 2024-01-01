package dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeDto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
    String ename;
    String empaddress;
    LocalDate empdob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	public LocalDate getEmpdob() {
		return empdob;
	}
	public void setEmpdob(LocalDate empdob) {
		this.empdob = empdob;
	}
    
}
