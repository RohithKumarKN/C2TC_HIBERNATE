/**
 * 
 */
package com.CG.JPACrud.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Rohith
 *
 */
public class JPAUtil {
	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	static {
		factory = Persistence.createEntityManagerFactory("JPA-PU");
	}

	public static EntityManager getEntityManger() {
		if (entityManager == null || !entityManager.isOpen()) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}
}
