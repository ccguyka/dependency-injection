package org.ccguyka.saloon;

import com.google.inject.Inject;

public class PetSaloon {


	private PetService service;

	@Inject
	public PetSaloon(PetService service) {
		this.service = service;
	}

	public void feed(Pet pet) {
		System.out.println("Feed new customer pet " + pet.name());
		service.doServiceFor(pet);
	}

	public void open() {
		System.out.println("Pet Service Saloon has opened");
	}

	public void waitForClient() {
		System.out.println("Waiting for client pets");

	}
}
