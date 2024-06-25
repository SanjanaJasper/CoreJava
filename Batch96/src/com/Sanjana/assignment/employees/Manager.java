package com.Sanjana.assignment.employees;

public class Manager extends Employee{
	
	public static void main(String[] agrs) {
		//TODO Auto-generated method stub
	}

	private int teamSize;
	Employee emp = new Employee();

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	//implementing tostrings()
	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + ", emp=" + emp + "]";
	}


	}
