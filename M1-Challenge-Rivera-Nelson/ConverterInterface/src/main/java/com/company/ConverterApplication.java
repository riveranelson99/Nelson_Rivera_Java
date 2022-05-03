package com.company;

import com.company.interfaces.Converter;

import java.util.Scanner;

public class ConverterApplication {

    public static void main(String[] args) {

        Converter userInput = new ConverterIf();
        Converter userInputTwo = new ConverterSwitch();
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a month in numerical form.");

        String userMonth = userInput.convertMonth(Integer.parseInt(scan.nextLine()));

        System.out.println("Please enter a day of the week in numerical form.");

        String userDay = userInput.convertDay((Integer.parseInt(scan.nextLine())));

        System.out.println("==========");
        System.out.println("That month is: " + userMonth);
        System.out.println("That day of the week is: " + userDay);

        System.out.println("Please enter another month in numerical form.");

        String userMonthTwo = userInputTwo.convertMonth(Integer.parseInt(scan.nextLine()));

        System.out.println("Please enter another day of the week in numerical form.");

        String userDayTwo = userInputTwo.convertDay(Integer.parseInt(scan.nextLine()));

        System.out.println("==========");
        System.out.println("That month is: " + userMonthTwo);
        System.out.println("That day of the week is: " + userDayTwo);

    }
}
