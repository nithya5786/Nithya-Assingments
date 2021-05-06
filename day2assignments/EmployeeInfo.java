package week3.day2assignments;

import java.util.Collections;
import java.util.TreeMap;

public class EmployeeInfo {

	public static void main(String[] args) 
	{
     //Create TreeMap
	TreeMap<Integer,String> employeeInfo =new TreeMap<Integer,String>(Collections.reverseOrder());
	//Add elements to TreeMap
	employeeInfo.put(100,"Hari");
	employeeInfo.put(101, "Naveen");
	employeeInfo.put(102, "Sam");
	employeeInfo.put(104, "Balaji");
	//Print the Reverse Order
	System.out.println("TreeMap in reverse order :"+employeeInfo);
	
	

	}

}
