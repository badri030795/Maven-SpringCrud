package com.sample.employee.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;
import javax.persistence.Column;


@Entity
@Table(name = "emp_Desc")
public class Employee {

	@Id
//	@GeneratedValue
	private long id;

	@Column(name = "first_name")
	private String firstName;

	public long getId() {
		return id;
	}

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "Designation")
	private String designation;

	@Column(name = "Salary")
	private int salary;

	@Column(name = "Joined_date")
	private Date joinedDate;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", designation="
				+ designation + ", salary=" + salary + ", joinedDate=" + joinedDate + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
}
