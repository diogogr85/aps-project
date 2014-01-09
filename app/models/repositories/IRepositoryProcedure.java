package models.repositories;

import java.util.List;

import models.entity.Procedure;

public interface IRepositoryProcedure {

	public void create(Procedure procedure);
	public void remove(Long id);
	public void update(Procedure procedure);
	public List<Procedure> all(); 
	public Procedure findProcedureById(Long id);
	
}
