package _hash_set;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {

		// It does not allow duplicates
		HashSet<String> mySet = new HashSet<>();

		mySet.add("Toronto");
		mySet.add("vancouver");
		mySet.add("Hamilton");

		System.out.println(mySet);

		System.out.println(mySet.contains("toronto"));

		mySet.remove("Hamilton");
		System.out.println(mySet);

	}

}
