package com.company;

public class CalculatorApplication {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Integer 1+1 equals: " + calc.addition( 1, 1));
        System.out.println("Integer 23-52 equals: " + calc.subtraction(23, 52));
        System.out.println("Integer 34*2 equals: " + calc.multiplication(34, 2));
        System.out.println("Integer 12/3 equals: " + calc.division(12, 3));
        System.out.println("Integer 12/7 equals: " + calc.division(12, 7));

        System.out.println("Double 3.4+2.3 equals: " + calc.addition(3.4d, 2.3d));
        System.out.println("Double 6.7*4.4 equals: " + calc.multiplication(6.7d, 4.4d));
        System.out.println("Double 5.5-0.5 equals: " + calc.subtraction(5.5d, 0.5d));
        System.out.println("Double 10.8/2.2 equals: " + calc.division(10.8d, 2.2d));

    }

}
