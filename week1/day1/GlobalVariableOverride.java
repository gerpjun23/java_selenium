package jun23.week1.day1;

public class GlobalVariableOverride {
	
	String color = "Red";

	
	public void driveBus()
	{
		String paint = "Yellow";
		System.out.println(color);
	}
	
	public void driveCar()
	{
		System.out.println(color);
	}	
	
	public void driveBike()
	{
		System.out.println(color);
	}
	
	public void driveLambogini()
	{
		System.out.println(color);
	}
	
	

	public static void main(String[] args) {
		GlobalVariableOverride globalVar = new GlobalVariableOverride();
		globalVar.driveBus();
		globalVar.driveCar();
		globalVar.driveBike();
		
		System.out.println("Main Method:" + globalVar.color);
	}

}
