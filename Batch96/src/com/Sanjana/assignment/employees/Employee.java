package com.Sanjana.assignment.employees;

public class Employee {
	
	private String name;
	private int employeeId;
	private int salary;
	
	//to displaay the details
	void show() {
		System.out.println("Name:"+name+"\t Id:"+employeeId+ "\t Salary:"+salary);
	}
	
	//implementing tostrings()
	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", salary=" + salary + "]";
	}
	
	// getter and setters for the private attributes
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
