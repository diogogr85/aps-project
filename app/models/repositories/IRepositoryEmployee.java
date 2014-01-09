package models.repositories;

import java.util.List;

import models.entity.Employee;

public interface IRepositoryEmployee {

	public void create(Employee employee);
	public List<Employee> all(); 
	public Employee findEmployeeById(Long id);
}
