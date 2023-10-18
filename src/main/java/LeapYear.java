public class LeapYear {
    public static LeapYear of(int year) throws LeapYearIsNotDivisibleByFourException, LeapYearException {
        if(year % 4 != 0) {
            throw new LeapYearIsNotDivisibleByFourException(year);
        }else if(isNotLeapYear(year)){
            throw new LeapYearException(year + " is not leap year because is divisible by 4 and 100 but not by 400");
        }
        return null;
    }
    private static boolean isNotLeapYear(int year) {
        return year % 4 == 0 && year % 100 == 0 && year % 400 != 0;
    }
}
// is_not_a_leap_year_because_is_divisible_by_four_and_one_hundred_and_not_is_divisible_by_four_hundred