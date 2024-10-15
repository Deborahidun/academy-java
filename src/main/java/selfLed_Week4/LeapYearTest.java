package selfLed_Week4;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LeapYearTest {

	// Method to check if a year is a leap year or not
	private static boolean isLeapYear(int year) {
		// Check if the year is divisible by 400 or divisible by 4 and not divisible by
		// 100
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

	// Test case to check if a year is a leap year
	@Test
	public void testLeapYear() {
		int year = 2020;
		boolean expectedResult = true;

		boolean actualResult = isLeapYear(year);

		// Directly assert the actual result
		assertTrue(actualResult);
	}

	// Test case to check if a year is not a leap year
	@Test
	public void testNotLeapYear() {
		int year = 1900;
		boolean expectedResult = false;

		boolean actualResult = isLeapYear(year);

		// Directly assert the actual result
		assertFalse(actualResult);
	}
}
