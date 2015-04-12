package org.ccguyka.saloon;

import org.ccguyka.binding.BindingModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Run {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new BindingModule());

		PetSaloon saloon = injector.getInstance(PetSaloon.class);
		saloon.open();
		saloon.waitForClient();
		saloon.feed(new Cat());
	}

}
