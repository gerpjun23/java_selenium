package jun23.week1.day1;

public class CalculatorGlobalVariable {

	//Global variable is defined at the Class level
	public int a=20;
	public int b=11;
	
	public void addition()
	{
	//addition is local variable
		int addition = a+b;
	System.out.println("Addition of a and b is:" + addition);
	}
	
	public void subtraction()
	{
		//subtraction is local variable
	int subtraction =a-b;
	System.out.println("Subtraction of a and b is:" + subtraction);
	}
	
	public void multiplication()
	{
		int multiplication =a*b;
		System.out.println("multiplication of a and b is:" + multiplication);	
	}
	
	public void division()
	{
		int division =a/b;
		System.out.println("division of a and b is:" + division);
	}
	
	public void modOperator()
	{
		int mod =a%b;
		System.out.println("mod of a and b is:" + mod);
	}
	
	public static void main(String[] args) {
		CalculatorGlobalVariable digitalCalc = new CalculatorGlobalVariable();
		digitalCalc.addition();
		digitalCalc.subtraction();
		digitalCalc.multiplication();
		digitalCalc.division();
		digitalCalc.modOperator();
	}

}
