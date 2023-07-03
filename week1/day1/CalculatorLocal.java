package jun23.week1.day1;

public class CalculatorLocal {
	
	
	public void addition() {
		//local variable - Local to the method
		int a= 10;
		int b= 20;
		int addition = a+b;
		System.out.println("addition of 10 and 20 is:" + addition);
	}
	
	public void subtraction()
	{
		//local variable - Local to the method
		int a= 10;
		int b=20;
		int subtraction = a-b;
		System.out.println("subtraction of 10 and 20 is:" + subtraction);
	}
	
	public void multiplication()
	{
		//local variable - Local to the method
		int a= 10;
		int b=20;
		int multiplication = a*b;
		System.out.println("multiplication of 10 and 20 is:" + multiplication);
	}
	
	public void division()
	{
		//local variable - Local to the method
		int a= 10;
		int b=20;
		int division = a*b;
		System.out.println("division of 10 and 20 is:" + division);
	}
	
	public static void main(String[] args) {
	
		CalculatorLocal digitalCalc = new CalculatorLocal();
		digitalCalc.addition();
		digitalCalc.subtraction();
		digitalCalc.multiplication();
		digitalCalc.division();
		
		GlobalVariableOverride globalVar = new GlobalVariableOverride();
		globalVar.driveBike();
		globalVar.driveBus();
		globalVar.driveCar();
	}
	

}
