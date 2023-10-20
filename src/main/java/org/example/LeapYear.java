package org.example;

public class LeapYear {
    private final int year;

    private LeapYear(int year) {
        this.year = year;
    }

    public static LeapYear of(int year) throws LeapYearException {
        if(!isDivisibleByFour(year)) {
            throw new LeapYearException(year + " is not leap year because is not divisible by 4");
        }else if(isNotLeapYear(year)){
            throw new LeapYearException(year + " is not leap year because is divisible by 4 and 100 but not by 400");
        }
        return new LeapYear(year);
    }
    // TODO: Rename this method
    private static boolean isNotLeapYear(int year) {
        return isDivisibleByFour(year) && isDivisibleByOneHundred(year) && isNotDivisibleByFourHundred(year);
    }

    private static boolean isNotDivisibleByFourHundred(int year) {
        return year % 400 != 0;
    }

    private static boolean isDivisibleByOneHundred(int year) {
        return year % 100 == 0;
    }

    private static boolean isDivisibleByFour(int year) {
        return year % 4 == 0;
    }

    public int getYear() {
        return year;
    }
}