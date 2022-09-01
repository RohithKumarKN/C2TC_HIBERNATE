/**
 * 
 */
package com.CG.JPACrud.Service;

import com.CG.JPACrud.Entities.Student;

/**
 * @author Rohith
 *
 */
public interface StudentService {
	
	public abstract Student findStudentById(int id);

	public abstract void addStudent(Student student);

	public abstract void removeStudent(Student student);

	public abstract void updateStudent(Student student);
}
