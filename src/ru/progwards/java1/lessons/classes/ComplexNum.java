package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a,b;

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public ComplexNum add(ComplexNum num) {
//        System.out.println(this);
//        System.out.println(num);
//        System.out.println( (this.a + num.a) + "+" + (this.b + num.b) + "i" );
        return new ComplexNum((this.a + num.a),(this.b + num.b));


    }

    public ComplexNum sub(ComplexNum num) {
        return new ComplexNum((this.a - num.a),(this.b - num.b));
    }

    public ComplexNum mul(ComplexNum num) {
        return new ComplexNum((this.a * num.a - this.b * num.b),(this.b * num.a + this.a * num.b));
    }

    public ComplexNum div(ComplexNum num) {
        return new ComplexNum(  ( ( this.a * num.a + this.b * num.b )/(num.a * num.a + num.b * num.b) ), ( (this.b * num.a - this.a * num.b)/(num.a * num.a + num.b * num.b) )       );
    }



    @Override
    public String toString() {

        return this.a + "+" + this.b + "i";
    }

    public static void main(String[] args) {
        ComplexNum aaa = new ComplexNum(1,7);
//        System.out.println(aaa.toString());
        ComplexNum bbb = new ComplexNum(3,8);

    }


}
