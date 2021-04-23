package week2.day2;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		String str1 = "Stops";
	    String str2 = "potss";
        boolean result = true;
        if (str1.length() != str2.length()) {  
            result = false;  
        } else {  
            char[] ArrayS1 = str1.toLowerCase().toCharArray();  
            char[] ArrayS2 = str2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            result = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (result) {  
            System.out.println(str1 + " and " + str2 + " are anagrams");  
        } else {  
            System.out.println(str1 + " and " + str2 + " are not anagrams");  
        } 
	    
	    

	    	    
	    
	    }	

	}


