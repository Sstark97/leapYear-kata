public class LeapYear {
    public static LeapYear of(int year) throws LeapYearIsNotDivisibleByFourException {
        if(year % 4 != 0) {
            throw new LeapYearIsNotDivisibleByFourException(year);
        }
        return null;
    }
}
