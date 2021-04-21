package week2.day2;

public class RemoveDuplicates {


        public static void main(String[] args)
	    {
        	String name = "We learn java basics as part of java sessions in java week1";//input the string name
		//int count=0;//set counter to 0
		String[] str=name.split(" ");//split the string using split("")
		for (int i = 0; i < str.length; i++)//traverse through length of the loop 
		{
			for (int j = i+1; j<str.length; j++)//traverse through inner loop till end of the string length
			{
				if(str[i].equals(str[j]))//check if both words in the character array are same
				{
					str[j]= " ";
				}			
			
										
			
			}
			System.out.print(str[i]+ " ");
			}
	}
}

	


