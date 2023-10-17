import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class LeapYearShould {
    @Test
    public void is_not_a_leap_year() {
        assertFalse(isLeapYear(0));
    }

    private boolean isLeapYear(int year) {
        return false;
    }
}
