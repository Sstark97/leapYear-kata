import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearShould {
    @ParameterizedTest
    @ValueSource(ints = {2, 3, 2001, 2005, 3035, 4099, 15343})
    public void is_not_a_leap_year(int year) {
        assertFalse(isLeapYear(year));
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