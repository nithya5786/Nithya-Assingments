 package week2.day2;

public class SumOfDigits {

	public static void main(String[] args) 
	{
		int n,sum=0;
		int num= 123;
		
		while(num>0) {
			n=num%10;
			sum=sum+n;
			num=num/10;
			
		}
			System.out.println("sum of the digit is"  + sum  );
		}
				
		
	}




