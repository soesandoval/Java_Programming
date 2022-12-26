package day35_polymorphism.transportationTask;

import day34_abstraction.animalTask.Flyable;
import day34_abstraction.animalTask.Swimmable;

public class CydeoCar extends Car implements Flyable, Electric, Swimmable {

    public CydeoCar(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void fly() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    @Override
    public void swim() {

    }
}
