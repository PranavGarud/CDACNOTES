package day3;

public class Remote {
	
	private boolean isCurtainOpen;
	
	public Remote()
	{
		isCurtainOpen = false;
	}
	
	public void operateCurtain() {
		if(isCurtainOpen)
		{
			System.out.println("Curtain is closing");
			isCurtainOpen = false;
		}
		else
		{
			System.out.println("Curtain is opening");
			isCurtainOpen = true;
		}
	}
	
	public String getCurtainStatus()
	{
		if(isCurtainOpen)
		{
			return "Open";
		}
		else
		{
			return "Close";
		}
	}
}
