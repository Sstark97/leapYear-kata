import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearShould {
    @ParameterizedTest(name="Error element {index}: {0} is a leap year")
    @ValueSource(ints = {2, 3, 427, 431, 435, 439, 1997, 2001, 2005, 2335, 2339, 2343, 2347, 2351, 2355, 2359, 2363,
            2367, 2371, 2375, 2379, 2383, 2387, 2391, 2395, 2399, 3035, 4099, 4437, 15343, 1800})
    public void is_not_a_leap_year(int year) {
        assertFalse(isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 8, 12, 16, 1840, 1836, 1996, 2024, 3044, 4444, 8888, 16444, 2028, 2032, 2036, 2040, 2044,
            2048, 2052, 2056, 2060, 2064, 2068, 2072, 2076, 2080, 2084,2340, 2344, 2348, 2352, 2356, 2360, 2364, 2368,
            2372, 2376, 2380, 2384, 2388, 2392, 2396, 2400})
    void is_a_leap_year(int year) {
        assertTrue(isLeapYear(year));
    }

    private boolean isLeapYear(int year) {
        return year % 4 == 0;
    }
}