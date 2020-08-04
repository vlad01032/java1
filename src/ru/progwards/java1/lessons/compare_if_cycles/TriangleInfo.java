package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static void main(String[] args) {
        System.out.println(isTriangle(1,7,1));
        System.out.println(isRightTriangle(5,4,3));
        System.out.println(isIsoscelesTriangle(1,7,7));
    }

    public static boolean isTriangle(int a, int b, int c) {
        if (a<(b+c) && b<(a+c) && c<(a+b)) {
            return true;
        }
        return false;
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        if ( ((a*a)+(b*b) == (c*c)) || ((b*b)+(c*c) == (a*a)) || ((a*a)+(c*c) == (b*b))) {
            return true;
        }
        return false;
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        if ((a==b) || (a==c) || (b==c)) {
            return true;
        }
        return false;
    }
}
