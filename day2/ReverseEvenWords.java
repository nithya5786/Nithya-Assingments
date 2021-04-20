package week2.day2;

public class ReverseEvenWords {

	public static void main(String[] args) 
	{
		
				String str[] = "I am a software tester".split(" "); // Split each word from the sentence
				int len = str.length; // Length of the given sentence
			 	String out = ""; // output 
				String rev = ""; // Alternate words that get reversed
				// Traverse the entire sentence 
				for (int i = 0; i < len; i++) 
				{ 
					 
					String words = str[i]; // Take each word
					 
					if (i % 2 != 0)// Identify the alternative word to reverse
					{ 
						 
						for (int j = words.length() - 1; j >= 0; j--)// Traverse from right to left and add the it in 'rev' 
						{ 
							rev = rev + words.charAt(j); 
						} 
						 
						out = out + rev + " ";//accumulate the same in the answer variable to preserve the order. 
						// Reset the revWords variable to reverse the next alternate word. 
						rev = ""; 
					} 
					
					else 
						out = out + str[i] + " ";// Accumulate the words to answer variable which are next to the reversed Words.  
				} 
				System.out.println(out); 
			} 
	

	}


