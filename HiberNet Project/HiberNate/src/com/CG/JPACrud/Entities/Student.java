/**
 * 
 */
package com.CG.JPACrud.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Rohith
 *
 */
@Entity
@Table(name = "student")
public class Student {
	@Id
	private int stdid;
	private String sname;

	public int getStdid() {
		return stdid;
	}

	public void setStdid(int stdid) {
		this.stdid = stdid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Student() {

	}

	public Student(int stdid, String sname) {
		this.stdid = stdid;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", sname=" + sname + ", getStdid()=" + getStdid() + ", getSname()="
				+ getSname() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
