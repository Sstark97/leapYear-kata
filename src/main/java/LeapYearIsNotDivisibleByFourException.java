public class LeapYearIsNotDivisibleByFourException extends Exception {

    public LeapYearIsNotDivisibleByFourException(int year) {
        super(year + " is not leap year because is not divisible by 4");
    }
}
