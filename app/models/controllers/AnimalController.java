package models.controllers;

import java.util.List;

import models.entity.Animal;
import models.registers.AnimalRegister;
import models.registers.ProcedureRegister;

public class AnimalController {
	
	private AnimalRegister animalRegister;
	
	public AnimalController() {
		this.animalRegister = new AnimalRegister();
	}
	
	public void create(Animal animal) {
		animalRegister.create(animal);
	}

	public List<Animal> all() {
		return animalRegister.all();
	}

	public Animal findAnimalById(Long id) {
		return animalRegister.findAnimalById(id);
	}
}
