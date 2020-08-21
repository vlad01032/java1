package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {

    public static class CacheInfo {
        public int n;
        public int fibo;

    }

    private static CacheInfo lastFibo;

    public static int fiboNumber(int n) {
        if (lastFibo != null && lastFibo.n  == n) {
            return lastFibo.fibo;
        }
        int num1 = 1;
        int num2 = 1;
        int temp;
        for (int i = 2; i < n; i++){
            temp = num1+num2;
            num1 = num2;
            num2 = temp;
        }
        if (lastFibo == null){
            lastFibo = new CacheInfo();

        }

        lastFibo.n = n;
        lastFibo.fibo = num2;

        return num2;
    }

    public static CacheInfo getLastFibo(){
        return lastFibo;

    }

    public static void clearLastFibo(){
        lastFibo = null;
    }

    public static void main(String[] args) {
        System.out.println(lastFibo);
    }
}
