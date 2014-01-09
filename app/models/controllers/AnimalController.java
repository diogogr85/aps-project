package models.controllers;

import java.util.List;

import models.entity.Animal;
import models.factory.Factory;
import models.registers.AnimalRegister;
import models.registers.ProcedureRegister;
import models.registers.RegisterQuestion;

public class AnimalController {
	
	private AnimalRegister animalRegister;
	
	public AnimalController(Factory factory) {
		this.animalRegister = new AnimalRegister(factory);
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
