package week3.day1.assignments;

/*Class:Students
 * Method:getStudentInfo()
 */
public class Students {
	

	public void getStudents(int id) {
		System.out.println("student id is:" + " " + id);
	}

	public void getStudents(int id, String name) {
		System.out.println("student id and name is:" + " " + id + " " + name);
	}

	public void getStudents(String email, long phonenumber) 
	{
     System.out.println("student email and phonenumber is :"+" "+email+" "+phonenumber);
	}

	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudents(1100);
		obj.getStudents(1100, "Nithya");
		obj.getStudents("abc@gmail.com", 956612345);

	}

}
