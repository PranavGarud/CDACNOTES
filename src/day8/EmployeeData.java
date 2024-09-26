package day8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeData {

	public static List<Employee> initializeEmployeeData()
	{
		List<Employee> emps = new ArrayList<>();
		TreeSet<String> skills1 = new TreeSet<>();
		skills1.add("java");
		skills1.add("python");
		Employee e1 = new Employee(565,"aaa",700000,"IT",skills1);
		TreeSet<String> skills2 = new TreeSet<>();
		skills2.add("java");
		skills2.add("javascript");
		Employee e2 = new Employee(23,"vmoa",388888,"IT",skills2);
		TreeSet<String> skills3 = new TreeSet<>();
		skills3.add("c++");
		skills3.add("python");
		Employee e3 = new Employee(345,"nmoarni",49999,"IT",skills3);
		TreeSet<String> skills4 = new TreeSet<>();
		skills4.add("c++");
		skills4.add("c");
		Employee e4 = new Employee(741,"hreg",60000,"IT",skills4);
		TreeSet<String> skills5 = new TreeSet<>();
		skills5.add("maketing");
		skills5.add("communication");
		Employee e5 = new Employee(404,"vrom",45000,"Sales",skills5);
		TreeSet<String> skills6 = new TreeSet<>();
		skills6.add("c++");
		skills6.add("c");
		Employee e6 = new Employee(247,"mjdk",82000,"Sales",skills5);
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		emps.add(e6);
		return emps;
	}
	
	public static void main(String[] args)
	{
		List<Employee> emplist = initializeEmployeeData();
		Stream<Employee> stream = emplist.stream();
		
		Comparator<Employee> byname = Comparator.comparing(Employee::getName);
		System.out.println("Sorting by name");
		stream.sorted(byname).forEach(System.out::println);
		
		Comparator<Employee> deptdata = Comparator.comparing(Employee::getdept).thenComparing(byname);
		stream = emplist.stream();
		System.out.println("Department wise employee list ");
		stream.collect(Collectors.groupingBy(Employee::getdept)).forEach((k,v) -> System.out.println(k + ":" +v));
		
		stream = emplist.stream();
		System.out.println("Department wise total Salary ");
		Map<String, DoubleSummaryStatistics> salbydept = stream.collect(Collectors.groupingBy(Employee::getdept,Collectors.summarizingDouble(Employee::getSalary)));
		salbydept.forEach((k,v) -> System.out.println("Depertment :" + k +" "+ " : Total Salary : "+v));
		
		stream = emplist.stream();
		System.out.println("After salary increment");
		stream.map((emp) -> new Employee(emp.getEmpid(),emp.getName(),emp.getSalary()*1.1,emp.getdept(),emp.getSkills())).forEach(System.out::println);
		
		stream = emplist.stream();
		System.out.println("Employees who know java");
		stream.filter((emp) -> emp.getSkills().contains("java")).forEach(System.out::println);
		
		stream = emplist.stream();
		System.out.println("Min,max,average salary");
		OptionalDouble minsal = stream.mapToDouble(Employee::getSalary).min();
		System.out.println(minsal.getAsDouble());
		
		stream = emplist.stream();
		OptionalDouble maxsal = stream.mapToDouble(Employee::getSalary).max();
		System.out.println(maxsal.getAsDouble());
		
		stream = emplist.stream();
		OptionalDouble avesal = stream.mapToDouble(Employee::getSalary).average();
		System.out.println(avesal.getAsDouble());
	}
}
