package day6;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class EmployeeCollection {
 
	public List<Employee> initializeEmployeeData()
	{
		List<Employee> emps = new ArrayList<>();
		TreeSet<String> skills1 = new TreeSet<>();
		skills1.add("java");
		skills1.add("python");
		Employee e1 = new Employee(565,"aaa",700000,skills1);
		TreeSet<String> skills2 = new TreeSet<>();
		skills2.add("java");
		skills2.add("javascript");
		Employee e2 = new Employee(23,"vmoa",388888,skills2);
		TreeSet<String> skills3 = new TreeSet<>();
		skills3.add("c++");
		skills3.add("python");
		Employee e3 = new Employee(345,"nmoarni",49999,skills3);
		TreeSet<String> skills4 = new TreeSet<>();
		skills4.add("c++");
		skills4.add("c");
		Employee e4 = new Employee(741,"hreg",60000,skills4);
		
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		return emps;
	}
	public List<Employee> addEmployee(List<Employee> emps,Employee e)
	{
		emps.add(e);
		return emps;
	}
	public Employee getEmployee(List<Employee> emps, int empid)
	{
		for(Employee e: emps)
		{
			if(e.getEmpid()==empid)
			{
				return e;
			}
		}
		return null;
	}
	public void printEmployeeData(List<Employee>emps)
	{
		for(Employee e : emps)
		{
			System.out.println(e);
		}
	}
	public ArrayList<Employee> filterList(List<Employee> emps, String predicate)
	{ 
		ArrayList<Employee> filtered = new ArrayList<>();
		for(Employee e : emps)
		{
			if(e.getSkills().contains(predicate))
			{
				filtered.add(e);
			}
		}
		return filtered;
	}//Same logic for map 
}
