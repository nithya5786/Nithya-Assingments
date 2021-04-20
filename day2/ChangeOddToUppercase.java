package week2.day2;

public class ChangeOddToUppercase 
{

	public static void main(String[] args) 
	{
		
		        String name = "changename";//input sting name to change odd string to upper case
		        String output = "";//declare the output as "" to store the output
		        for (int i = 0; i < name.length(); i++)//traverse through the length of the string 
		        {
		            if(i%2 == 0)//check the odd string using mod operator
		            {
		                output += Character.toUpperCase(name.toCharArray()[i]);//change the string to upper case and store in output
		            }else
		            {
		                output += Character.toLowerCase(name.toCharArray()[i]);//Else change the string to lower case and store in output
		            }
		        }

		        System.out.println("Newly generated string is as follows: "+ output);//print the newly generated string
		    }
		
		}

	





