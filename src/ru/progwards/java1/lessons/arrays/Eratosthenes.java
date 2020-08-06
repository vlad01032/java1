package ru.progwards.java1.lessons.arrays;

public class Eratosthenes {
    private boolean[] sieve;
    private int len;

    public Eratosthenes(int N){
        sieve = new boolean[N];
        len = sieve.length;
        for (int i = 0; i < len; i++){
            sieve[i] = true;
        }
        sift();
    }

    private void sift(){
        for (int i = 2; i*i < len; i++){
            if (sieve[i]){
                for (int j = 2 * i; j < len; j += i) {
                    sieve[j] = false;
                }
            }
        }
    }

    public boolean isSimple(int n){
        return sieve[n];
    }

    public static void main(String[] args) {
        Eratosthenes arr = new Eratosthenes(30);
        System.out.println(arr.isSimple(17));
    }
}
