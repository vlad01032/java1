package ru.progwards.java1.lessons.bitsworld;

import java.util.Objects;

public class Binary {
    byte num;
    public Binary(byte num){
       this.num = num;

    }

    public String toString(){
        String result = "";
        String val = num < 0 ? "1" : "0";

        if (num == 0) return "00000000";

        while (num < -1 || num > 0 ) {
            if ((num & 1) == 0){
                result = "0" + result;
            } else {
                result = "1" + result;
            }
            num >>= 1;
        }

        while (result.length() < 7){
            result = "0" + result;
        }

        result = val + result;

        return result;
    }

    public static void main(String[] args) {
        Binary ss = new Binary((byte) 128);
        System.out.println(ss.toString());
    }
}
