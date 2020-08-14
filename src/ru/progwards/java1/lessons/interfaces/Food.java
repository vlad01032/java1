package ru.progwards.java1.lessons.interfaces;

public class Food implements CompareWeight {

    private int weight;

    public Food(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return this.weight;
    }

    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt) {
        return null;
    }

    public static void sort(int[] a){
        int temp;
        for (int i = 0; i < a.length - 1; i++){
            for (int j = i + 1; j < a.length; j++){
                if (a[j] < a[i]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
