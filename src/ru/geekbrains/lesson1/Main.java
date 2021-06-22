package ru.geekbrains.lesson1;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        System.out.println(disc (1, 0, -9));

        int x = 2;

        if (isMark(x)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static double disc(double a, double b, double c) {

        return b * b - 4 * a * c;

    }

    public static boolean even(int a) {
        return a % 2 == 0;
    }

    public static boolean isMark(int a) {

        return a >= 2 && a <= 5;
    }
}