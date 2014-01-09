package models;

import java.util.List;

import models.controllers.AnimalController;
import models.controllers.EmployeeController;
import models.controllers.ProcedureController;
import models.entity.Animal;
import models.entity.Employee;
import models.entity.Procedure;

public class VetSofFacade {

	private ProcedureController procedureControl;
	private AnimalController animalControl;
	private EmployeeController employeeControl;

	private static VetSofFacade instance;
	
	public VetSofFacade() {
		procedureControl = new ProcedureController();
	}
	
	public static VetSofFacade getInstance() {
		if(instance == null) {
			instance = new VetSofFacade();
		}
		return instance;
	}
	
	public void createProcedure(Procedure procedure) {
		procedureControl.create(procedure);
	}

	public void removeProcedure(Long id) {
		procedureControl.remove(id);
	}

	public void updateProcedure(Procedure procedure) {
		procedureControl.update(procedure);
	}

	public List<Procedure> allProcedures() {
		return procedureControl.all();
	}

	public Procedure findProcedureById(Long id) {
		return procedureControl.findProcedureById(id);
	}
	
	public void createAnimal(Animal animal) {
		animalControl.create(animal);
	}
	
	public List<Animal> allAnimals() {
		return animalControl.all();
	}

	public Animal findAnimalById(Long id) {
		return animalControl.findAnimalById(id);
	}
	
	public void createEmployee(Employee employee) {
		employeeControl.create(employee);
	}
	
	public List<Employee> allEmployees() {
		return employeeControl.all();
	}

	public Employee findEmployeeById(Long id) {
		return employeeControl.findEmployeeById(id);
	}
}
