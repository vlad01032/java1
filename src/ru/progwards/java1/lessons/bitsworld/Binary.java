package ru.progwards.java1.lessons.bitsworld;

import java.util.Objects;

public class Binary {
    int num;
    public Binary(byte num){
       this.num = num;
    }

    public String toString(){

        if (num == 0) return "00000000";

        String result = "";
        String sign = num < 0 ? "1" : "0";

        if (num < 0) num += 256;

        while (num > 1){
            if ((num & 1) == 0){
                result = "0" + result;
            } else {
                result = "1" + result;
            }
            num >>= 1;
        }
        result = num + result;

        if (result.length() <= 7) {

            while (result.length() < 7) {
                result = "0" + result;
            }
            result = sign + result;
        }
        return result;
    }

    public static void main(String[] args) {
        Binary ss = new Binary((byte) 156);
        System.out.println(ss.toString());
    }
}
