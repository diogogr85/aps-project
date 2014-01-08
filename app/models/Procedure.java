package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import play.db.ebean.Model;

@SuppressWarnings("serial")
@Entity
public class Procedure extends Model {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String procedureType;
	private String description;
	private String doctor;
	private String auxiliar;
	private String animal;
	
//	public Procedure(String type, String description, String responsible, String auxiliar, String animal) {
//		this.procedureType = type;
//		this.description = description;
//		this.doctor = responsible;
//		this.auxiliar = auxiliar;
//		this.animal = animal;
//	}
	
	public static Procedure getInstance() {
		return new Procedure();
	}
	
	public long getId() {
		return id;
	}
//	public void setId(long id) {
//		this.id = id;
//	}
	
	public String getProcedureType() {
		return procedureType;
	}
	public void setProcedureType(String procedureType) {
		this.procedureType = procedureType;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	
	public String getAuxiliar() {
		return auxiliar;
	}
	public void setAuxiliar(String auxiliar) {
		this.auxiliar = auxiliar;
	}
	
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	

	public static Finder<Long,Procedure> find = new Finder(
			Long.class, Procedure.class
			);
	
	public static List<Procedure> all() {
		return find.all();
	}
		
	public static void create(Procedure procedure) {
		procedure.save();
	}
	
	public static void delete(Long id) {
//		Thing thing = Thing.find.where().idEq(id).findUnique();
//	    thing.delete();
//	    Procedure procedure = Procedure.find.where().idEq(id).findUnique();
//	    procedure.delete();
		find.ref(id).delete();
	}
	
	public static Procedure getProcedureById(Long id) {
		Procedure actual =  find.where().idEq(id).findUnique();
	return actual;
	}
	
	public static void update(Long id, Procedure procedure) {
		find.ref(id).update(procedure);
	}
}
