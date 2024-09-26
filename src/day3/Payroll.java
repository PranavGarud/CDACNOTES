package day3;


public class Payroll {
	
	public void displayTax(TaxPayer payer1)
	{
		System.out.println("Tax for the current month :  "+payer1.calculateTax());
	}
	public void displayGross(Employee e)
	{
		System.out.println(e);
		System.out.println("Gross Salary for the month : " +e.calculateGross());
	}
	public void displayNet(SalariedEmployee e)
	{
		System.out.println(e);
		System.out.println("Net Salary for the month : "+ e.calculateNet());
		
	}
	public static void main(String [] args) {
		Payroll payroll = new Payroll();
		SalariedEmployee se = new SalariedEmployee(546,"HHH",75000);
		Manager m = new Manager(452,"eee",90000,50000);
		
		payroll.displayGross(se);
		payroll.displayGross(m);
		
		Employee[] emps = new Employee[3];
		emps[0] = new SalariedEmployee(25,"Nikhil",70000);
		emps[1] = new Manager(36,"Pranav",70000,30000);
		emps[2] = new SalesManager(75,"Akash",80000,30000,50000);
		
		for(Employee e : emps)
		{
			payroll.displayGross(e);
			//payroll.displayNet(e);
		}
		
		SalariedEmployee[] semps = new SalariedEmployee[3];
		semps[0] = new SalariedEmployee(56,"Saurabh",60000);
		semps[1] = new Manager(37,"Omkar",80000,40000);
		semps[2] = new SalesManager(76,"Sahil",70000,20000,40000);
		
		for(SalariedEmployee  semp : semps)
		{
			payroll.displayNet(semp);
			if(semp instanceof SalesManager)
			{
				SalesManager ss = (SalesManager)semps[2];
				ss.showIncentive();
			 	
			}
		}
			//Down casting is requiered to invoke method present in the sub class
			//but not present in superclass
		
		SalesManager ss = (SalesManager)semps[2];
		ss.showIncentive();
		
  	}
}
