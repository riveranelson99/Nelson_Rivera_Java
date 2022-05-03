package com.company;

import com.company.interfaces.Converter;

public class ConverterSwitch implements Converter {

    public String convertMonth(int month) {

        switch ( month ) {
            case 1: month = 1;
                    return "January";
            case 2: month = 2;
                    return "February";
            case 3: month = 3;
                    return "March";
            case 4: month = 4;
                    return "April";
            case 5: month = 5;
                    return "May";
            case 6: month = 6;
                    return "June";
            case 7: month = 7;
                    return "July";
            case 8: month = 8;
                    return "August";
            case 9: month = 9;
                    return "September";
            case 10: month = 10;
                    return "October";
            case 11: month = 11;
                    return "November";
            case 12: month = 12;
                    return "December";
            default: return "Please try again.";
        }
    }

    public String convertDay(int day) {

        switch ( day ) {
            case 1: day = 1;
                    return "Sunday";
            case 2: day = 2;
                    return "Monday";
            case 3: day = 3;
                    return "Tuesday";
            case 4: day = 4;
                    return "Wednesday";
            case 5: day = 5;
                    return "Thursday";
            case 6: day = 6;
                    return "Friday";
            case 7: day = 7;
                    return "Saturday";
            default: return "Please try again.";
        }
    }
}
