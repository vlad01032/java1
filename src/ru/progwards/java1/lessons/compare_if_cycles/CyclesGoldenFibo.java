package ru.progwards.java1.lessons.compare_if_cycles;

class CyclesGoldenFibo {
    public static void main(String[] args) {
        System.out.println(containsDigit(-102,1));
        System.out.println(fiboNumber(10));

        for (int i = 1; i <= 15; i++) {
            System.out.println(fiboNumber(i));
        }

        System.out.println(isGoldenTriangle(1,1,3));

        for (int i = 1; i <= 15; i++) {
            for (int j = 2; j <= 16; j++) {
                if ((fiboNumber(i)*2)+fiboNumber(j) <= 100) {
                    if (isGoldenTriangle(fiboNumber(i),fiboNumber(i),fiboNumber(j))){
                        System.out.print("Длина ребер = " + fiboNumber(i));
                        System.out.println("Длина основания = " + fiboNumber(j));
                    }
                }
            }
        }


    }

    public static boolean containsDigit(int number, int digit) {
        if (number == 0 && digit == 0)
            return true;
        if (number < 0)
            number *= -1;
        while(number != 0) {
            if(number % 10 == digit)
                return true;
            number = number/10;
        }
        return false;
    }

    public static int fiboNumber(int n) {
        int num1 = 1;
        int num2 = 1;
        int temp;
        for (int i = 2; i < n; i++){
            temp = num1+num2;
            num1 = num2;
            num2 = temp;
        }
        return num2;
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {
        if (a==b) {
            if ( ((double)a/(double)c) >= 1.61703 && ((double)a/(double)c) <= 1.61903 )
                return true;
        }

        if (b==c) {
            if ( ((double)b/(double)a) >= 1.61703 && ((double)b/(double)a) <= 1.61903 )
                return true;
        }

        if (a==c) {
            if ( ((double)a/(double)b) >= 1.61703 && ((double)a/(double)b) <= 1.61903 )
                return true;
        }

        return false;
    }






}
