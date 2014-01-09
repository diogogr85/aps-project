package models.repositories;

import java.util.List;

import play.db.ebean.Model.Finder;

import models.entity.Animal;
import models.entity.Employee;

public class RepositoryEmployee implements IRepositoryEmployee {

	public static Finder<Long, Employee> find = new Finder(Long.class, Employee.class);
	
	@Override
	public void create(Employee employee) {
		employee.save();
	}

	@Override
	public List<Employee> all() {
		return find.all();
	}

	@Override
	public Employee findEmployeeById(Long id) {
		return find.ref(id);
	}

}
