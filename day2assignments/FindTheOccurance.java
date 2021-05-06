package week3.day2assignments;

import java.util.HashMap;
import java.util.Map;

public class FindTheOccurance {

	public static void main(String[] args) 
	{
	String str  = "Welcome to Selenium automation"	;
	
	HashMap<Character,Integer> charCountMap =new HashMap<Character,Integer>();
	char[] strArray = str.toCharArray();
	for (char c : strArray) 
	{
		if(charCountMap.containsKey(c))
		{
			charCountMap.put(c, charCountMap.get(c)+1);
		}
		else
		{
			charCountMap.put(c, 1);
			
		}
		
		System.out.println(charCountMap);
	}
	
	

	}

}
