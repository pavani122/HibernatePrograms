package com.techouts.xmlPrograms;

public class EmployeeXml {

	private int empId;
	private String empName;
	private float empSalary;
	private CompanyXml company;
	
	public CompanyXml getCompany() {
		return company;
	}
	public void setCompany(CompanyXml company) {
		this.company = company;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	
}
