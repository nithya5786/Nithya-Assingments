package week3.day2assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// Declare a string
		String name = "PayPal India";
		// Convert it to char array
		char[] charArray = name.toCharArray();
		// Declare a set as charSet for Character
		Set<Character> charSet = new HashSet<Character>();
		// Declare a set as dupCharSet for duplicate character
		Set<Character> dupCharSet = new HashSet<Character>();
		// Iterate character array and add it into charSet
		for (int i = 0; i < charArray.length; i++) {
			char val = charArray[i];
			if (val != ' ') {
				charSet.add(new Character(charArray[i]));

			}
			// If the character is already in the charSet then,add it to dupCharSet

			if (charSet.contains(charArray[i])) {
				dupCharSet.add(new Character(charArray[i]));

			}

		}

		// Check the dupCharSet elements and remove those in the charSet
		if (dupCharSet.equals(charSet)) {
			charSet.remove(dupCharSet);
		}

		// Iterate using charSet
		// Check the iterator variable is not
		// Print each character for CharSet
		Iterator value1 = charSet.iterator();
		System.out.println("The values in charset are :");
		while (value1.hasNext()) {
			System.out.println(value1.next());
		}
	}
}
