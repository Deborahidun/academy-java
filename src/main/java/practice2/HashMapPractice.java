package practice2;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		HashMap<String, Integer> schoolSystem = new HashMap<>();

		schoolSystem.put("Deborah", 100);
		schoolSystem.put("Ashley", 80);
		schoolSystem.put("Hanna", 78);
		schoolSystem.put("Maggi", 90);
		schoolSystem.put("Josh", 70);

		System.out.println("Enter Student Name: ");
		String studentName = scanner.nextLine();

		if (schoolSystem.containsKey(studentName)) {
			System.out.println("Student grade is: " + schoolSystem.get(studentName));
		} else {
			System.out.println("The student name cannot be found");

		}
	}

}
