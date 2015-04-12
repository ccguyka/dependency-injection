package org.ccguyka.saloon;


public class VegetarianPetFeeder implements PetFeeder {
    @Override
    public void feed(Pet pet) {
        pet.eats("Salad");
    }
}
