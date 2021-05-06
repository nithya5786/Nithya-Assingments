package week3.day2assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingUsingCollections {

	public static void main(String[] args) {

		String[] arr = new String[] { "HCL", "Wipro", "Aspire Systems", "CTS" };
		System.out.println("Original array: ");
		// Get the Length of the array
		System.out.print(arr.length + " ");
		List<String> list = new ArrayList<String>();
		for (String text : arr) {
			list.add(text);
		}
		System.out.println(list);
		Set<String> set = new TreeSet<String>();
		set.addAll(list);
		System.out.println("After Sorting");
		for (String str : set) 
		{
			System.out.println(" " +str);
		}
		
					
		/*list.addAll(set);
		Collections.reverse(list);
		System.out.println();
		System.out.println("after reverse");
		for (String str1 : list) {
			System.out.println(" " +str1);
		}*/
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("After Reversing :" +list);
		}

	}

