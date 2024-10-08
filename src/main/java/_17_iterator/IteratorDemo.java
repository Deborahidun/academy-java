package _17_iterator;

import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		Iterator<String> iterator = myBooks.iterator();

		while (iterator.hasNext()) {
			String bookName = iterator.next();

		}

	}

}
