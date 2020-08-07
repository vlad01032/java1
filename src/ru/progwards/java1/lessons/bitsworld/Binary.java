package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    byte num;
    public Binary(byte num){
       this.num = num;
    }

    public String toString(){
        String result = "";
        String val = "0";
        boolean flag = num > 0;

        if (num == 0) return "00000000";

        if (!flag) {
            num *= -1;
            val = "1";
        }

        while (num > 0) {
            if ((num & 1) == 0){
                result = "0" + result;
            } else {
                result = "1" + result;
            }
            num >>= 1;
        }

        while (result.length() < 8){
            result = val + result;
        }

        return result;
    }

    public static void main(String[] args) {
        Binary ss = new Binary((byte) 3);
        System.out.println(ss.toString());
    }
}
