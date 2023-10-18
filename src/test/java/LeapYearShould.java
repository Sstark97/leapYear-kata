import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class LeapYearShould {
    @Test
    public void is_not_a_leap_year() {
        assertFalse(isLeapYear(1));
    }

    private boolean isLeapYear(int year) {
        return false;
    }
//  A year is a leap year if it is divisible by 4.