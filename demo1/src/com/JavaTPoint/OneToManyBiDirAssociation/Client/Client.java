/**
 * 
 */
package com.JavaTPoint.OneToManyBiDirAssociation.Client;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.JavaTPoint.OneToManyBiDirAssociation.Entities.Library;
import com.JavaTPoint.OneToManyBiDirAssociation.Entities.Student;

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

		// Creation of book
		Library library = new Library();
		// library.setB_id(1);
		library.setB_name("JAVATPOINT");
		em.persist(library);

		Library lib = new Library();
		// lib.setB_id(2);
		lib.setB_name("DBMS");
		em.persist(lib);
		ArrayList<Library> list = new ArrayList<Library>();
		list.add(library);
		list.add(lib);

		// Creation of Student
		Student student = new Student();
		// student.setS_id(101);
		student.setS_name("Rohith Kumar K N");
		student.setBooks_issued(list);
		em.persist(student);

		em.getTransaction().commit();

		System.out.println("Data is added to database");
	}

}
