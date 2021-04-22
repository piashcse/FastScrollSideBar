package com.piashcse.fastcrollsidebar;



import java.util.Comparator;

public class LettersComparator implements Comparator<ItemEntity<String>> {

	public int compare(ItemEntity<String> o1, ItemEntity<String> o2) {
		if (o1.getSortLetters().equals("@")
			|| o2.getSortLetters().equals("#")) {
			return 1;
		} else if (o1.getSortLetters().equals("#")
				   || o2.getSortLetters().equals("@")) {
			return -1;
		} else {
			return o1.getSortLetters().compareTo(o2.getSortLetters());
		}
	}

}
