import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearShould {
    @Test
    public void is_not_a_leap_year() {
        assertFalse(isLeapYear(1));
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 8, 12, 16, 1840, 1836, 2024, 3044, 4444, 8888, 16444})
    void is_a_leap_year(int year) {
        assertTrue(isLeapYear(year));
    }

    private boolean isLeapYear(int year) {
        return year % 4 == 0;
    }
}