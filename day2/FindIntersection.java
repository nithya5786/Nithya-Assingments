package week2.day2;

public class FindIntersection {

	public static void main(String[] args)
	{
		int Array1[] = {3, 2, 11, 4, 7};//Declare an array using a group of numbers {3,2,11,4,7}
	    int Array2[] = {1, 2, 8, 4, 9,7};//Declare an array using a group of numbers {1,2,8,4,9,7}
	      System.out.println("Intersection of the two arrays :");//Print the intersection of arrays
	     
	      for(int i = 0; i<Array1.length; i++ ) //traverse through the length of the first array
	      {
	         for(int j = 0; j<Array2.length; j++) //inner loop to traverse through second array
	         {
	            if(Array1[i]==Array2[j]) //check if both the members of the array are same
	            {
	               System.out.println(Array1[i]);//print the similar numbers (intersection of numbers from both the arrays)
	            }
	          

	}

}
}
}