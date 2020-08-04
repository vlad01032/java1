package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a,b;

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public ComplexNum add(ComplexNum num) {
        System.out.println(this);
        System.out.println(num);
        return null;
    }


    @Override
    public String toString() {
        return this.a + "+" + this.b + "i";
    }

    public static void main(String[] args) {
        ComplexNum aaa = new ComplexNum(1,7);
//        System.out.println(aaa.toString());
        ComplexNum bbb = new ComplexNum(3,8);
        aaa.add(bbb);
    }


}
