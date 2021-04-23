package week2.day2;

public class Armstrong {

	public static void main(String[] args) 
	{
		int count=0,a,temp;  
	    int n=153;//It is the number to check armstrong  
	    temp=n;  
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    count=count+(a*a*a);  
	    }  
	    if(temp==count)  
	    System.out.println("armstrong number");   
	    else  
	    System.out.println("Not armstrong number");   
	   }  


	}


