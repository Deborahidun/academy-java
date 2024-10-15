package practice2;

import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean replay = true;

		do {
			try {
				System.out.println("Enter a 4 digit pin: ");
				String pin = scanner.nextLine();

				if (pin.length() != 4)
					throw new InvalidPinException("Pin must be 4 numbers");

			} catch (InvalidPinException e) {

				System.out.println(e.getMessage());
			} finally {
				System.out.println("This is the pin validator");

			}

		}

		while (replay == true);
		scanner.close();
	}
}
