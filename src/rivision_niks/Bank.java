package rivision_niks;

public class Bank {
	public static void main(String args[])
	{ 
		Saving s1 = new Saving(11,"Dung",5000);
		
			s1.viewBalance();	
	        s1.withdraw(2000);
	        s1.withdraw(300);
	        s1.withdraw(500);
	        s1.withdraw(100);
	        s1.viewBalance();
	        
	        Current s2 = new Current(12,"Niks",7000);
	        s2.viewBalance();
	        s2.withdraw(4000);
	        s2.withdraw(100);
	
		
	}
	

}
