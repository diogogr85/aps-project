package models.factory;

import models.repositories.IRepositoryAnimal;
import models.repositories.IRepositoryEmployee;
import models.repositories.IRepositoryProcedure;


public abstract class Factory {

	public abstract IRepositoryProcedure createRepositoryProcedure();
	
	public abstract IRepositoryAnimal createRepositoryAnimal();
	
	public abstract IRepositoryEmployee createRepositoryEmployee();
}
