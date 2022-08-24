/**
 * 
 */
package com.CG.JPACrud.Dao;

import com.CG.JPACrud.Entities.Student;

/**
 * @author Rohith
 *
 */
public interface StudentDao {
	public abstract Student getStudentById(int id);
	

	public abstract void addStudent(Student sudent);

	public abstract void removeStudent(Student student);

	public abstract void updateStudent(Student student);
	

	public abstract void commitTransaction();

	public abstract void beginTransaction();
}
