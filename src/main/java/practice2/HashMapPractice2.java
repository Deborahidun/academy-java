package practice2;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractice2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		HashMap<String, String> country = new HashMap<>();

		country.put("Ghana", "Accra");
		country.put("Canada", "Ottawa");

		System.out.println("Select an option 1 -5");
		System.out.println("1. Add new country");
		System.out.println("2. Look up country capital");
		System.out.println("3. Exit");

		int userInput = scanner.nextInt();
		scanner.nextLine();

		switch (userInput) {
		case 1:
			System.out.println("Enter country name:  ");
			String countryName = scanner.nextLine();
			System.out.println("Enter country capital: ");
			String countryCapital = scanner.nextLine();

			if (country.containsKey(countryName) || country.containsKey(countryCapital)) {
				System.out.println("This information already exists");
			} else {
				country.put(countryName, countryName);
				String newInfo = scanner.nextLine();
				System.out.println("New data has been stored");
			}

			break;

		case 2:

			System.out.println("Enter country name to see capital: ");
			String inputForCapital = scanner.nextLine();

			if (country.containsKey(inputForCapital)) {
				System.out.println(inputForCapital + "'s capital is " + country.get(inputForCapital));
			}
			break;

		case 3:
			if (userInput == 3) {
				System.out.println("You have exited this application");
			}

		}

		scanner.close();

	}
}
