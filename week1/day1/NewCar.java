package jun23.week1.day1;

public class NewCar {
	
	//syntax for method: public void methodName(){}
	public void applyBrake()
	{
		System.out.println("Apply Brake - THis is applyBrake method");
	}
	
	public void applyHonk() {
		System.out.println("Apply Honk - THi is applyHonk emthod");

	}	
	//main+Ctrl+Space+Enter
	//main method - public static void main(String args[])
		
	public static void main(String args[])
	{
		
		System.out.println("This is the main method");
		//Define the Object of Class in the main method
		//Syntax: ClassName objectName = new ClassName();
		NewCar toyota = new NewCar();
		
		//syntax to invoke or call method: objectName.methodName();
		toyota.applyHonk();
		toyota.applyBrake();
		
	}
}
