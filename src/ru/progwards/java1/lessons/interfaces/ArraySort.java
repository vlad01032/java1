package ru.progwards.java1.lessons.interfaces;

public class ArraySort {

    public static void sort(CompareWeight[] a){
        CompareWeight temp;
        for (int i = 0; i < a.length - 1; i++){
            for (int j = i + 1; j < a.length; j++){
                if (a[j].compareWeight(a[i]) == CompareWeight.CompareResult.LESS){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Animal aa = new Animal(5.0);
        Animal aa1 = new Animal(3.0);
        Food af = new Food(1);
        CompareWeight[] test = {aa,aa1,af};
        ArraySort.sort(test);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i].getWeight());
        }
    }
}
