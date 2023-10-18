import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearShould {
    @Test
    public void is_not_a_leap_year() {
        assertFalse(isLeapYear(1));
    }

    @Test
    public void is_a_leap_year() {
        assertTrue(isLeapYear(4));
    }

    private boolean isLeapYear(int year) {
        return year == 4;
    }
}
//  A year is a leap year if it is divisible by 4.