package jun23.week1.day2;

public class LearnInheritanceParentCar extends LearnInheritanceVehicle {
	
	public void airConditioner()
	{
		System.out.println("This is Parent Method - AirConditioner");
	}

	public static void main(String[] args) {
		
		LearnInheritanceParentCar lipc = new LearnInheritanceParentCar();
		lipc.airConditioner();
		lipc.applyBrake();
		lipc.soundHorn();
		
	}

}
