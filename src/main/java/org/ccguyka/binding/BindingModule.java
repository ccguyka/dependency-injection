package org.ccguyka.binding;

import org.ccguyka.saloon.PetFeeder;
import org.ccguyka.saloon.VegetarianPetFeeder;

import com.google.inject.AbstractModule;

public class BindingModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(PetFeeder.class).to(VegetarianPetFeeder.class);
//		bind(PetFeeder.class).to(MeatPetFeeder.class);
	}
}
