package models.factory;

import models.entity.*;
import models.repositories.*;

public class FactoryBD extends Factory {

	@Override
	public IRepositoryProcedure<Procedure> createRepositoryProcedure() {
		return new RepositoryProcedure();
	}

	@Override
	public IRepositoryAnimal<Animal> createRepositoryAnimal() {
		return new RepositoryAnimal();
	}

	@Override
	public IRepositoryEmployee<Employee> createRepositoryEmployee() {
		return new RepositoryEmployee();
	}

}
