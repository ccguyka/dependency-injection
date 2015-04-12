package org.ccguyka.saloon;

public class Cat implements Pet {

	@Override
	public void eats(String food) {
		System.out.println("Miau, juicy " + food);
	}

	@Override
	public String name() {
		return "Kitty";
	}
}
