/**
 * 
 */
package com.CG.OneToManyBiDirAssociation.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.CG.OneToManyBiDirAssociation.Entities.Department;
import com.CG.OneToManyBiDirAssociation.Entities.Employee;

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

		// Creation of Department
		Department department = new Department();

	
		department.setName("Home");
		em.persist(department);

		// Creation of Employee
		Employee employee = new Employee();
		employee.setEname("Rohith");
		employee.setEsalary(50000);
	
		em.persist(employee);

		em.getTransaction().commit();

		System.out.println("Data added to the database");
	}

}
