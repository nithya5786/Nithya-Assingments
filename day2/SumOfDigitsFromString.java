package week2.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
String text ="abc123vb34";
int sum =0;
int temp;
char[] char1 = text.toCharArray();
for(int i=0;i<char1.length;i++)
{
	temp=0;
	if(Character.isDigit(char1[i]))
{
	temp = Character.getNumericValue(char1[i]);
	sum=sum+temp;
}
		System.out.println("the sum of digits in the string is "+sum);
}

	
	}


	}


