package week3.day1.assignments;

public class Desktop implements Hardware,Software {

	
	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Software Resources");
	}

	public void hardwareResources() {
		System.out.println("Hardware Resources");
		
	}
	public static void main(String[] args) 
	{
		Desktop d =new Desktop();
		d.hardwareResources();
		d.softwareResources();

	}

}