package models.registers;

import java.util.List;

import models.entity.Employee;
import models.factory.Factory;
import models.repositories.IRepositoryEmployee;
import models.repositories.RepositoryEmployee;

public class EmployeeRegister implements IRepositoryEmployee<Employee> {

private IRepositoryEmployee<Employee> repositoryEmployee;
	
	public EmployeeRegister(Factory factory) {
		repositoryEmployee = factory.createRepositoryEmployee();
	}
	
	@Override
	public void create(Employee employee) {
		repositoryEmployee.create(employee);
	}

	@Override
	public List<Employee> all() {
		return repositoryEmployee.all();
	}

	@Override
	public Employee findEmployeeById(Long id) {
		return repositoryEmployee.findEmployeeById(id);
	}

}
