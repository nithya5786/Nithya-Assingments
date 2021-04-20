package week2.day2;

public class Palindrome {
	public static void main(String[] args) {
		String original = "madam";//input the original string name as "madam"
				String reverse = ""; // characters to get reversed   
				         
				      int length = original.length();   //declare length of the original string
				      for ( int i = length - 1; i >= 0; i-- )  //traverse through loop from right to left of the string
				         reverse = reverse + original.charAt(i);  //add the character at the position to reverse
				      if (original.equals(reverse))  //check if original is equal to reverse
				         System.out.println(original+" is a palindrome.");  //if same print as palindrome
				      else  
				         System.out.println(original+" is not a palindrome.\"");//else print as not a palindrome
	}

}
