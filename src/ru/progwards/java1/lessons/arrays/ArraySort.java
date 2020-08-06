package ru.progwards.java1.lessons.arrays;

public class ArraySort {

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
