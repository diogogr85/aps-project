package models.controllers;

import java.util.List;

import models.entity.Employee;
import models.factory.Factory;
import models.registers.EmployeeRegister;

public class EmployeeController {

	private EmployeeRegister employeeRegister;
	
	public EmployeeController(Factory factory) {
		this.employeeRegister = new EmployeeRegister(factory);
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
