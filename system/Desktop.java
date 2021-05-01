package org.system;

/*Assignment 1
 * 
 * Description:
 * Super class as Computer and sub class as Desktop using single inheritance
 * 
 */
public class Desktop extends Computer {

	public static void main(String[] args) {
	
		Desktop len = new Desktop();
		len.computerModel();
		len.desktopSize();
	}
	public static void desktopSize() 
	{
		
		System.out.println("The desktop size 11 inches");
	}

}
