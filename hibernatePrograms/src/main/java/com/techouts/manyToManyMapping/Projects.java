package com.techouts.manyToManyMapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Projects {

	@Id
	private int projectId;
	private String projectName;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	  @JoinTable(name = "READER_SUBSCRIPTIONS", joinColumns =
	                  {@JoinColumn(referencedColumnName = "ID")}
	      , inverseJoinColumns = {@JoinColumn(referencedColumnName = "ID")})
	private List<Employees> employees;
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public List<Employees> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employees> employees) {
		this.employees = employees;
	}
	
	
}
