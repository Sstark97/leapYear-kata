public class LeapYear {
    public static LeapYear of(int year) throws LeapYearException {
        if(year % 4 != 0) {
            throw new LeapYearException(year + " is not leap year because is not divisible by 4");
        }else if(isNotLeapYear(year)){
            throw new LeapYearException(year + " is not leap year because is divisible by 4 and 100 but not by 400");
        }
        return null;
    }
    private static boolean isNotLeapYear(int year) {
        return year % 4 == 0 && year % 100 == 0 && year % 400 != 0;
    }
}