package week2.day2;

public class ChangeOddToUppercase 
{

	public static void main(String[] args) 
	{
		
		String name = "changename";// input sting name to change odd string to upper case
		char[] chars = name.toCharArray();
		for (int i = 0; i < chars.length; i++) 
		{

			if (i % 2 != 0) 
			{

				
				System.out.print(Character.toUpperCase(chars[i]));
			}

			else 
			{
				System.out.print(chars[i]);

			}

        
		
		}
	}
}

	





