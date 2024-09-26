package day6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class EmployeePortal {

	public static void main(String[] args)
	{
		EmployeeCollection e = new EmployeeCollection();
		List<Employee> emplist = e.initializeEmployeeData();
		
		e.printEmployeeData(emplist);
		System.out.println("--------------------------------------------------");
		
		System.out.println("Searching Employee");
		Employee found = e.getEmployee(emplist,741);
		System.out.println("Data : " + found);
		System.out.println("--------------------------------------------------");
		
		List<Employee> emps = new ArrayList<>();
		TreeSet<String> skills1 = new TreeSet<>();
		skills1.add("java");
		skills1.add("python");
		Employee e1 = new Employee(343,"rrr",76000,skills1);
		
		e.addEmployee(emplist, e1);
		e.printEmployeeData(emplist);
		System.out.println("--------------------------------------------------");
		
		System.out.println("Sorting by employee id ");
		Collections.sort(emplist);
		e.printEmployeeData(emplist);
		int index = Collections.binarySearch(emplist, new Employee(741,null,0,null));
		System.out.println("--------------------------------------------------");
		System.out.println("Found at index:" + index);
		
		System.out.println("Sorting by Name:" );
		Collections.sort(emplist,new NameComparator());
		e.printEmployeeData(emplist);
		index = Collections.binarySearch(emplist, new Employee(0,"rrr",0,null),new NameComparator());
		System.out.println("--------------------------------------------------");
		System.out.println("Found at index:" + index);
		
		System.out.println("Sorting by salary:" );
		Collections.sort(emplist,new SalaryComparator());
		e.printEmployeeData(emplist);
		
		
				
		System.out.println("Filter By java skill");
		ArrayList<Employee> filtered = e.filterList(emplist, "java");
		e.printEmployeeData(filtered);
		
		
		
	}

}

