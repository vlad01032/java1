package ru.progwards.java1.lessons.interfaces;

public class Food implements CompareWeight {

    private int weight;

    public Food(int weight){
        this.weight = weight;
    }

    @Override
    public double getWeight(){
        return this.weight;
    }

}
