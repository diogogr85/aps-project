package models.registers;

import java.util.List;

import models.entity.Animal;
import models.factory.Factory;
import models.repositories.IRepositoryAnimal;

public class AnimalRegister implements IRepositoryAnimal<Animal>{

	private IRepositoryAnimal<Animal> repositoryAnimal;
	
	public AnimalRegister(Factory factory) {
		repositoryAnimal = factory.createRepositoryAnimal();
	}
	
	@Override
	public void create(Animal animal) {
		repositoryAnimal.create(animal);
	}

	@Override
	public List<Animal> all() {
		return repositoryAnimal.all();
	}

	@Override
	public Animal findAnimalById(Long id) {
		return repositoryAnimal.findAnimalById(id);
	}

}
