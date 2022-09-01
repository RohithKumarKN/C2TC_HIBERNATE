/**
 * 
 */
package com.CG.OneToManyBiDirAssociation.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.JavaTPoint.OneToManyBiDirAssociation.Entities.Library;

/**
 * @author Rohith
 *
 */

@Entity
@Table(name = "employee")
public class Employee {

	private static final long serialVersionUID = 1L;

	public Employee() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;

	private String ename;
	private int esalary;

	//@OneToMany(targetEntity = Department.class)
	private Department department;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department2) {
		// TODO Auto-generated method stub
		this.department = department;
	}
}
