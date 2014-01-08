package models;

import java.util.List;

import models.controllers.ProcedureController;
import models.entitie.Procedure;

public class VetSofFacade {

	private ProcedureController procedureControl;

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
}
