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
	 * 
	 */
	public Client() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService studentService = new StudentServiceImpl();
		Student student1 = new Student();
//Insert Operation
		student1.setStdid(101);
		student1.setSname("Rohith Kumar K N");
//Retrieval Operational
	}

}
