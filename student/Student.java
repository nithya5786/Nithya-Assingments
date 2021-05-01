package org.student;

import org.department.Department;

/* Package:org.student
 * Class:Student
 * Methods:studentName(),studentDept(),studentId()
 */

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("Nithya");
	}
	
	public void studentDept()
	{
		System.out.println("Electronics");
	}
    
	public void studentId()
	{
		System.out.println("1102858");
	}
	
	public static void main(String[] args) 
	{
		Student val =new Student();
		val.studentName();
		val.collegeCode();
		val.collegeName();
		val.collegeRank();
		val.studentDept();
		val.studentId();

	}

}
