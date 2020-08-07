package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
    public static int checkBit(byte value, int bitNumber){
        if (bitNumber == 0){
            return value & 1;
        } else {
            value >>= bitNumber;
            return value & 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(CheckBit.checkBit((byte) 11,2));
    }
}
