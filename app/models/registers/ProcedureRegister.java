package models.registers;

import java.util.List;

import models.entity.Procedure;
import models.repositories.IRepositoryProcedure;
import models.repositories.RepositoryProcedure;

public class ProcedureRegister implements IRepositoryProcedure {

	private IRepositoryProcedure repositoryProcedure;
	
	public ProcedureRegister() {
		repositoryProcedure = new RepositoryProcedure();
	}
	
	@Override
	public void create(Procedure procedure) {
		repositoryProcedure.create(procedure);
	}

	@Override
	public void remove(Long id) {
		repositoryProcedure.remove(id);
	}

	@Override
	public void update(Procedure procedure) {
		repositoryProcedure.update(procedure);
	}

	@Override
	public List<Procedure> all() {
		return repositoryProcedure.all();
	}

	@Override
	public Procedure findProcedureById(Long id) {
		return repositoryProcedure.findProcedureById(id);
	}

}
