package practice;

import java.util.ArrayList;

public class ArrayPractice {

	public static void main(String[] args) {
		
		ArrayList<String>city = new ArrayList<>();
		
		
		city.add("Toronto");
		city.add("Vancouver");
		city.add("Ottawa");
		city.add("Montreal");
		city.add("Calgary");
		
		
		System.out.println(city);
		System.out.println("Popular cities in Canada: " + city);
		
		
		System.out.println(city.getFirst() + " " + " " + city.getLast());
		System.out.println(city.get(0) + " " + city.get(3));
		
		city.set(3, "Oshawa");
		System.out.println(city);
		
		city.remove(3);
		System.out.println(city);
		
		for(String cities : city) {
			System.out.println(cities);
		}
		
		System.out.println(city.get(city.size()-1));
		
	}

}
