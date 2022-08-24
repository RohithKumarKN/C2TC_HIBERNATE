/**
 * 
 */
package com.CG.JPACrud.Service;

import com.CG.JPACrud.Dao.StudentDao;
import com.CG.JPACrud.Dao.StudentDaoImpl;
import com.CG.JPACrud.Entities.Student;

/**
 * @author Rohith
 *
 */
public class StudentServiceImpl implements StudentService {
	private StudentDao studentdao;

	public StudentServiceImpl() {
		studentdao = new StudentDaoImpl();
	}

	@Override
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		Student student = studentdao.getStudentById(id);
		return student;
	}
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentdao.beginTransaction();
		studentdao.addStudent(student);
		studentdao.commitTransaction();
	}

	@Override
	public void removeStudent(Student student) {
		// TODO Auto-generated method stub
		studentdao.beginTransaction();
		studentdao.removeStudent(student);
		studentdao.commitTransaction();
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentdao.beginTransaction();
		studentdao.updateStudent(student);
		studentdao.commitTransaction();
	}

}
