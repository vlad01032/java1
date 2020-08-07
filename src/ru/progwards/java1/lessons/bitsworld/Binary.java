package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    byte num;
    public Binary(byte num){
       this.num = num;
    }

    public String toString(){
        String result = "";
        boolean flag = num > 0;
        if (!flag) num *= -1;

        if (num == 0) return "00000000";

        while (num > 0) {
            if ((num & 1) == 0){
                result = "0" + result;
            } else {
                result = "1" + result;
            }
            num >>= 1;
        }

        if (flag) {
            result = "0" + result;
        } else result = "1" + result;

        return result;
    }

    public static void main(String[] args) {
        Binary ss = new Binary((byte) -127);
        System.out.println(ss.toString());
    }
}
