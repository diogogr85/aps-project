package models.repositories;

import java.util.List;

import models.entity.Animal;

public interface IRepositoryAnimal {

	public void create(Animal animal);
	public List<Animal> all(); 
	public Animal findAnimalById(Long id);
	
}
