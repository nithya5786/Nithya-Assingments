package week2.day2;

public class RevEvenWords {

	public static void main(String[] args) {
		
		String test ="I am a Software Tester";
		String[] split =test.split(" ");
		for(int i=0;i<split.length;i++) 
		{
if(i%2==0)
{
System.out.print(" ");
System.out.print(split[i]);
}
if(i%2!=0)
{
	System.out.print(" ");
	char[] even = (split[i]).toCharArray();
	for(int j=even.length-1;j>=0;j--)
	{
		System.out.print(even[j]);
	}
}
}
}
}	
