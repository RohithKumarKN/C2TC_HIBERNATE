/**
 * 
 */
package com.CG.JPAJSInheritance.Entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @author Rohith
 *
 */

@Entity
@Table(name = "manager")
@PrimaryKeyJoinColumn(referencedColumnName="employeeId")
public class Manager extends Employee {

	private static final long serialVersionUID = 1L;
	
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	

}
