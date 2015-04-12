package org.ccguyka.saloon;

import com.google.inject.Inject;

public class PetService {

	private PetFeeder petFeeder;

	@Inject
	public PetService(PetFeeder petFeeder) {
		this.petFeeder = petFeeder;
	}

	public void doServiceFor(Pet pet) {
		petFeeder.feed(pet);
	}
}
