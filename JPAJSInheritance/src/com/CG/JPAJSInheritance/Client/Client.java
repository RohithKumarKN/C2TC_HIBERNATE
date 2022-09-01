/**
 * 
 */
package com.CG.JPAJSInheritance.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.CG.JPAJSInheritance.Entities.Employee;
import com.CG.JPAJSInheritance.Entities.Manager;

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

		// Creation of Employee
		Employee employee = new Employee();

		employee.setEmployeeName("Rohith");
		employee.setEmployeeSalary(50000);

		em.persist(employee);

		// Creation of Manager
		Manager manager = new Manager();

		manager.setDepartmentName("Home");
		manager.setEmployeeName("Nagamma");
		manager.setEmployeeSalary(30000);

		em.persist(manager);

		em.getTransaction().commit();
	/*	em.close();
		factory.close();*/

		System.out.println("Data is added to the database");
	}

}
