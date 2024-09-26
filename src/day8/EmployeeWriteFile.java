package day8;

import day6.EmployeeCollection;

public class EmployeeWriteFile {
	public static void main (String args []) {
		File f = new File("employee.ser");
		EmployeeCollection c = new EmployeeCollection();
		List<Employee> emplist=c.initializeEmployeeData();
		try(ObjectOutputStream out) = new objectOutputStream (new FileOutputStream(f))){
			
		}
				
		
	}

}
