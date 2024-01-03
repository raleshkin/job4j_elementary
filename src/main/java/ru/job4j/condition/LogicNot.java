package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        if (num == 0) {
            return isPositive(num);
        } else {
            return !isPositive(num);
        }
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        System.out.println("Is even: " + isEven(4));
        System.out.println("Is positive: " + isPositive(5));
        System.out.println("Not even: " + notEven(3));
        System.out.println("Not positive: " + notPositive(-3));
        System.out.println("Not even and positive: " + notEvenAndPositive(5));
        System.out.println("Even or not positive: " + evenOrNotPositive(-4));
    }
}