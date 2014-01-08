package models.entitie;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Procedure extends Model {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
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
	
	
	public long getId() {
		return id;
	}
	
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
}
