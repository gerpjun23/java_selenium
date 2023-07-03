package jun23.week1.day1;

public class HelloWorld {
	
	//syntax for method: public void methodName();
	public void addition()
	{
		//variableType int
		int a = 10;
		int b = 20;
		int addition =a+b;
		System.out.println(addition);
	}

	// commenting a line 
	//main method
	public static void main(String[] args) {
		
		//print statement
		//Shortcut key Syso+Ctrl (without removing your finger)+SpaceBar+Enter
		
		System.out.println("HelloWorld");
		
		
		//Syntax for defining an Object: ClassName objectName = new ClassName(); 
		HelloWorld helloWorld = new HelloWorld();
		
		//Syntax: methodName.objectName();
		helloWorld.addition();
		
		
		
		
	}

}
