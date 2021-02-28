
/* Project:	Lab2
 * Class:	CUS1156
 * Author:	Aisha Naeem
 * Date:	February 28, 2021
 * This program examines, counts and prints out the number of unique string words in a list
 */

import java.util.ArrayList;

public class UniqueWords {
	/**
	 * counts the number of unique strings in a list
	 * 
	 * @param list ArrayList of strings to be examined
	 * @return number of unique strings in the list
	 */

	public static int countUnique(ArrayList<String> list) {
		int count = 0;

		String a = "";
		String b = "";

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {

				// -------------------------------------------------
				// This gets and stores the nested loop int i and int j formation of words
				a = list.get(i);
				b = list.get(j);

				// --------------------------------------------------
				// This increments the count for each unique word added
				if (i == j) {
					count++;
				}

				// --------------------------------------------------
				// This implements break command to avoid counting of same word more than once
				// so no duplicate count occurs
				if (a.equals(b)) {
					break;
				}
			}
		}
		return count;

	}

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("apple");
		words.add("orange");
		words.add("blackboard");
		words.add("apple");
		words.add("orange");
		words.add("sun");
		words.add("moon");

		int unique = countUnique(words);
		System.out.println(words + " has " + unique + " unique words");
	}
}
