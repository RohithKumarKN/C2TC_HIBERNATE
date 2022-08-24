/**
 * 
 */
package com.CG.JPACrud.Dao;

import javax.persistence.EntityManager;

import com.CG.JPACrud.Entities.Student;

/**
 * @author Rohith
 *
 */
public class StudentDaoImpl implements StudentDao {
	EntityManager entityManager;

	public StudentDaoImpl() {
		entityManager = JPAUtil.getEntityManger();
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		Student student = entityManager.find(Student.class, id);
		return student;
	}

	@Override
	public void addStudent(Student sudent) {
		// TODO Auto-generated method stub
		entityManager.persist(sudent);
	}

	@Override
	public void removeStudent(Student student) {
		// TODO Auto-generated method stub
		entityManager.remove(student);
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		entityManager.merge(student);
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
	}

}
