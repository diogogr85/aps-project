package models.repositories;

import java.util.List;

import models.entity.Procedure;


import play.db.ebean.Model;

public class RepositoryProcedure extends Model implements IRepositoryProcedure<Procedure> {
	
	
	public static Finder<Long, Procedure> find = new Finder(Long.class, Procedure.class);

	@Override
	public void create(Procedure procedure) {
		procedure.save();
	}

	@Override
	public void remove(Long id) {
		find.ref(id).delete();
	}

	@Override
	public void update(Procedure procedure) {
		find.ref(procedure.getId()).update(procedure);
	}

	@Override
	public List<Procedure> all() {
		return find.all();
	}

	@Override
	public Procedure findProcedureById(Long id) {
		return find.ref(id);
	}
	
}
