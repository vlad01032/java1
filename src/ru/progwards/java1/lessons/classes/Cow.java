package ru.progwards.java1.lessons.classes;

public class Cow extends Animal {
    public Cow(double weight) {

        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        return AnimalKind.COW;
    }

    @Override
    public FoodKind getFoodKind() {

        return FoodKind.HAY;
    }

    @Override
    public double getFoodCoeff() {

        return 0.05;
    }


    public static void main(String[] args) {
        Cow a2 = new Cow(15.0);
        System.out.println(a2.toString());
//        System.out.println(a2.getFoodCoeff());
    }
}

