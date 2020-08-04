package ru.progwards.java1.lessons.classes;

public class Animal {
    double weight;

    enum AnimalKind {
        ANIMAL, COW, HAMSTER, DUCK
    }

    enum FoodKind {
        UNKNOWN, HAY, CORN
    }

    public Animal(double weight) {

        this.weight = weight;
    }

    public AnimalKind getKind() {

        return AnimalKind.ANIMAL;
    }

    public FoodKind getFoodKind() {

        return FoodKind.UNKNOWN;
    }

    public double getWeight() {

        return this.weight;
    }

    public double getFoodCoeff() {

        return 0.02;
    }

    public double calculateFoodWeight() {

        return this.weight * getFoodCoeff();
    }

    public String toStringFull() {

        return "I am " + getKind() + " eat " + getFoodKind() + " " + calculateFoodWeight();
    }

    @Override
    public String toString() {

        return "I am " + getKind() + " eat " + getFoodKind();
    }


    public static void main(String[] args) {
        Animal a1 = new Animal(5.0);
        System.out.println(a1.toString());

    }

}
