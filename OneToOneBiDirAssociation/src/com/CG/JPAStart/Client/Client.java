/**
 * 
 */
package com.CG.JPAStart.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.CG.JPAStart.Entities.Address;
import com.CG.JPAStart.Entities.Student;

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

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		Student student = new Student();
		student.setStudentName("CHANDANA K N");
		Address address = new Address();

		address.setHousename("VISMITHA NILAYA");
		address.setStreet("SIRA GATE");
		address.setCity("TUMKUR");
		address.setPincode(720421);
		address.setState("Karnataka");

//Inject address into Student
		student.setAddress(address);
		em.persist(student);
		em.getTransaction().commit();

		System.out.println("Data is Added");
	}

}
