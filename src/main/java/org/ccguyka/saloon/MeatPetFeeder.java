package org.ccguyka.saloon;

public class MeatPetFeeder implements PetFeeder {

	@Override
	public void feed(Pet pet) {
		pet.eats("Meat");
	}
}
