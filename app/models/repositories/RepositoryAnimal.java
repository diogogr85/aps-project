package models.repositories;

import java.util.List;

import play.db.ebean.Model.Finder;

import models.entity.Animal;

public class RepositoryAnimal implements IRepositoryAnimal {

	public static Finder<Long, Animal> find = new Finder(Long.class, Animal.class);

	@Override
	public void create(Animal animal) {
		animal.save();
	}

	@Override
	public List<Animal> all() {
		return find.all();
	}

	@Override
	public Animal findAnimalById(Long id) {
		return find.ref(id);
	}

}
