package ru.progwards.java1.lessons.interfaces;

import java.util.Objects;

public class Animal implements FoodCompare, CompareWeight {

    double weight;

    public Animal(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) return true;
        if (anObject == null || getClass() != anObject.getClass()) return false;
        Animal animal = (Animal) anObject;
        return Double.compare(animal.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public int compareFoodPrice(Animal animal){
        return Double.compare(getFoodPrice(), animal.getFoodPrice());
    }

    @Override
    public String toString() {
        return "I am " + getKind() + ", eat " + getFoodKind();
    }

    enum AnimalKind {
        ANIMAL, COW, HAMSTER, DUCK
    }

    public enum FoodKind {
        UNKNOWN, HAY, CORN
    }

    public double getFood1kgPrice() {
        switch (getFoodKind()){
            case HAY: return 20;
            case CORN: return 50;
//            case UNKNOWN: return 0;
        }
        return 0;
    }

    public double getFoodPrice() {
        return calculateFoodWeight() * getFood1kgPrice();
    }

    public AnimalKind getKind() {

        return AnimalKind.ANIMAL;
    }

    public FoodKind getFoodKind() {

        return FoodKind.UNKNOWN;
    }

    @Override
    public double getWeight() {

        return this.weight;
    }

    public double getFoodCoeff() {

        return 0.02;    }

    public double calculateFoodWeight() {

        return this.weight * getFoodCoeff();
    }

    public String toStringFull() {

        return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();
    }

    public static void main(String[] args) {
//        Animal a1 = new Animal(5.0);
//        System.out.println(a1.toString());

    }

}
