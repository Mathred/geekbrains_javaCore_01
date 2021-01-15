package com.company;

public class Main {

    public static void main(String[] args) {

        byte byteVal = 127;
        short shortVal = 32767;
        int intVal = 2147483647;
        long longVal = 100L;
        float floatVal = 1.0f;
        double doubleVal = 1.0;
        char charVal = 1;
        boolean bool = false;

        System.out.println("byte: " + byteVal);
        System.out.println("short: " + shortVal);
        System.out.println("int: " + intVal);
        System.out.println("long: " + longVal);
        System.out.println("float:" + floatVal);
        System.out.println("double: " + doubleVal);
        System.out.println("char: " + charVal);
        System.out.println("bool: " + bool);

        System.out.println(multiplier(1,1,1,1));

        System.out.println("Number is between 10 and 20: "+ifBetween10And20(0,5));

        printPositiveOrNegative(-1);

        System.out.println("Number is negative: "+ifNegative(-1));

        helloName("Andrey");

        ifLeap(100);
        ifLeap(2000);
        ifLeap(1900);
        ifLeap(0);


    }

    public static double multiplier(float a, float b, float c, float d){return a*(b+(c/d));}

    public static boolean ifBetween10And20(int a, int b){return ( (a+b) >= 10 && (a+b) <= 20 );}

    public static void printPositiveOrNegative (int a){
        if (a>=0) System.out.println("Number is positive");
        else System.out.println("Number is negative");

    }

    public static boolean ifNegative(int a){return a <= 0;}

    public static void helloName(String name){
        System.out.println("Привет, "+name);
    }

    public static void ifLeap(int a){
        if (a % 4 == 0  && ((a % 100) != 0 || (a % 400 == 0))) System.out.println("Year "+a+" is leap");
        else System.out.println("Year "+a+" is not leap");
    }
}

