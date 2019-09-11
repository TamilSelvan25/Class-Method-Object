package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	public void empName() {
		System.out.println("Name:Tamilselvan");

	}
	public static void main(String[] args) {
		Employee e=new Employee();
		Company c=new Company();
		Client cl=new Client();
		Project p=new Project();
		e.empName();
		c.companyName();
		cl.clientName();
		p.projectName();
		
	}


}
