/**
 * 
 */
package com.CG.JPACrud.Client;

import com.CG.JPACrud.Entities.Student;
import com.CG.JPACrud.Service.StudentService;
import com.CG.JPACrud.Service.StudentServiceImpl;

/**
 * @author Rohith
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentService studentService = new StudentServiceImpl();
		Student student = new Student();
		// Insert Operation
		student.setSname("Rohith Kumar K N");
		student.setStdid(101);
		studentService.addStudent(student);

		StudentService studentService1 = new StudentServiceImpl();
		Student student1 = new Student();
		// Insert Operation
		student1.setSname("Chandana K N");
		student1.setStdid(3);
		studentService1.addStudent(student1);

		System.out.println("One Student Data is added");
		// Retrieval Operational
	}

}
