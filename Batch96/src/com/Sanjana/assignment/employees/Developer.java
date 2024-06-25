package com.Sanjana.assignment.employees;

public class Developer extends Employee {
	
	public static void main(String[] agrs) {
		//TODO Auto-generated method stub
	}
	
	private String Domain;
	Employee emp = new Employee();

	public String getDomain() {
		return Domain;
	}

	public void setDomain(String domain) {
		Domain = domain;
	}

	@Override
	public String toString() {
		return "Developer [Domain=" + Domain + "]";
	}
}
