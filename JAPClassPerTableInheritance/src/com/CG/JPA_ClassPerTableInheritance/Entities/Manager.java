/**
 * 
 */
package com.CG.JPA_ClassPerTableInheritance.Entities;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Rohith
 *
 */
@Entity
@Table(name = "manager")
public class Manager extends Employee {
	
	private static final long serialVersionUID = 1L;
	
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
