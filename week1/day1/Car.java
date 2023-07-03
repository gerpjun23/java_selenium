package jun23.week1.day1;

public class Car {
	
	//method should be written outside main method and within the Class
		//SYntax for method: public void methodName();
		public void applyBrake()
		{
			System.out.println("Apply the Brake");
		}
		
		public void applyHonk()
		{
			System.out.println("Apply Honk");
		}
		
		public static void main(String[] args) {
			
			//Syntax: ClassName objectName = new ClassName();
			Car toyota = new Car();
			toyota.applyBrake();
			toyota.applyHonk();
			

		}

	

}
