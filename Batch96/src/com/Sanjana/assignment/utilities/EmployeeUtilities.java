package com.Sanjana.assignment.utilities;

	import com.Sanjana.assignment.employees.Manager;
	import com.Sanjana.assignment.employees.Developer;
	public class EmployeeUtilities {

		public void manager(String Name, int employeeId, int salary, int teamSize) {

			Manager manager = new Manager();
			manager.setName(Name);
			manager.setEmployeeId(employeeId);;
			manager.setSalary(salary);
			manager.setTeamSize(teamSize);
			System.out.println(manager);	
		}

		public void developer(String Name, int employeeId, int salary,String Domain ) {
			Developer dev = new Developer();
			dev.setName(Name);
			dev.setEmployeeId(salary);
			dev.setSalary(salary);
			dev.setDomain(Domain);
			System.out.println(dev);
		}
	}