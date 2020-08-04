package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static void main(String[] args) {
        System.out.println(reverseDigits(457));
    }
    public static int reverseDigits(int number) {
        return Integer.parseInt(Integer.toString(number%10) + Integer.toString((number/10)%10) + Integer.toString(number/100));
    }
}




class Astronomy {
    public static void main(String[] args) {
        System.out.println(earthSquare());
        System.out.println(mercurySquare());
        System.out.println(jupiterSquare());
        System.out.println(earthVsMercury());
        System.out.println(earthVsJupiter());
    }

    public static Double sphereSquare(Double r) {
        final double pi = 3.14;
        return 4*pi*(r*r);
    }

    public static Double earthSquare() {
        return sphereSquare(6371.2);
    }

    public static Double mercurySquare() {
        return sphereSquare(2439.7);
    }

    public static Double jupiterSquare() {
        return sphereSquare(71492.0);
    }

    public static Double earthVsMercury() {
        return earthSquare()/mercurySquare();
    }

    public static Double earthVsJupiter() {
        return earthSquare()/jupiterSquare();
    }


}




class AccuracyDoubleFloat {
    final static double pi = 3.14;
    final static double R = 6371.2;

    public static void main(String[] args) {
        System.out.println(calculateAccuracy(R));
    }

    public static double volumeBallDouble(double radius) {
        return (4*pi*(radius*radius*radius))/3;

    }

    public static float volumeBallFloat(float radius) {
       return (float) (4*pi*(radius*radius*radius))/3;
    }

    public static double calculateAccuracy(double radius) {
        return volumeBallDouble(radius) - volumeBallFloat((float) radius);

    }


}