package models.registers;

import java.util.List;

import models.entity.Animal;
import models.repositories.IRepositoryAnimal;
import models.repositories.RepositoryAnimal;

public class AnimalRegister implements IRepositoryAnimal{

	private IRepositoryAnimal repositoryAnimal;
	
	public AnimalRegister() {
		repositoryAnimal = new RepositoryAnimal();
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
