package models.controllers;

import java.util.List;

import models.entity.Employee;
import models.registers.EmployeeRegister;

public class EmployeeController {

	private EmployeeRegister employeeRegister;
	
	public EmployeeController() {
		this.employeeRegister = new EmployeeRegister();
	}
	
	public void create(Employee employee) {
		employeeRegister.create(employee);
	}

	public List<Employee> all() {
		return employeeRegister.all();
	}

	public Employee findEmployeeById(Long id) {
		return employeeRegister.findEmployeeById(id);
	}
}
