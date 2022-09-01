/**
 * 
 */
package com.CG.JPA_ClassPerTableInheritance.Client;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.CG.JPA_ClassPerTableInheritance.Entities.Employee;
import com.CG.JPA_ClassPerTableInheritance.Entities.Manager;

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
		Scanner sc = new Scanner(System.in);
		em.getTransaction().begin();

		System.out.println("Enter the name of the employee");
		String employeeName = sc.next();
		System.out.println("Enter the Salaray of the employee");
		int employeeSalary = sc.nextInt();

		// Creation of employee
		Employee employee = new Employee();
		employee.setEmployeeName(employeeName);
		employee.setEmployeeSalary(employeeSalary);
		em.persist(employee);

		// Creation of Manager
		System.out.println("Enter the name of the Manager");
		String managerName = sc.next();
		System.out.println("Enter the salary of the Manager");
		int mangerSalary = sc.nextInt();
		System.out.println("Enter the Department name");
		String departmentName = sc.next();

		Manager manager = new Manager();
		manager.setDepartmentName(departmentName);
		manager.setEmployeeName(managerName);
		manager.setEmployeeSalary(mangerSalary);
		em.persist(manager);

		em.getTransaction().commit();

		System.out.println("Data added to the database");

	}

}
