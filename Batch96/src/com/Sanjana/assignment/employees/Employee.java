package com.Sanjana.assignment.employees;

public class Employee {
	
	private String name;
	private int employeeId;
	private int salary;
	
	void show() {
		System.out.println("Name:"+name+"\t Id:"+employeeId+ "\t Salary:"+salary);
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", salary=" + salary + "]";
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
