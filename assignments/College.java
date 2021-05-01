package week3.day1.assignments;

public class College extends University {

	public static void main(String[] args) {
		College c = new College();
		c.pg();
		c.ug();

	}

	@Override
	public void ug() {
		System.out.println("UG");

	}

}
