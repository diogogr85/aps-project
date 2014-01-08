package models.controllers;

import java.util.List;

import models.entitie.Procedure;
import models.registers.ProcedureRegister;

public class ProcedureController {

	private ProcedureRegister procedureRegister;
	
	public ProcedureController() {
		this.procedureRegister = new ProcedureRegister();
	}
	
	public void create(Procedure procedure) {
		procedureRegister.create(procedure);
	}

	public void remove(Long id) {
		procedureRegister.remove(id);
	}

	public void update(Procedure procedure) {
		procedureRegister.update(procedure);
	}

	public List<Procedure> all() {
		return procedureRegister.all();
	}

	public Procedure findProcedureById(Long id) {
		return procedureRegister.findProcedureById(id);
	}
	
}
