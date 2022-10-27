package com.techouts.xmlPrograms;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class CompanyXml {
	
	private int companyId;
	private String companyName;
	private String companyAddress;
	private List<EmployeeXml> employee;
	
	public List<EmployeeXml> getEmployee() {
		return employee;
	}
	public void setEmployee(List<EmployeeXml> employee) {
		this.employee = employee;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	
}
