package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static int sumBits(byte value){
        int result = 0;
        for (int i = 0; i < 8; i++){
            if ((value & 1) == 1) result += 1;
            value >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(SumBits.sumBits((byte) 255));
    }
}
