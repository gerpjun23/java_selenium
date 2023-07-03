package jun23.week1.day2;

public class LearnInheritanceVehicle {

	public void applyBrake()
	{
		System.out.println("This is Grant Parent Class - ApplyBrake Method");
	}
	
	public void soundHorn()
	{
		System.out.println("This is Grant Parent Class - SoundHorn Method");
	}
	
	public static void main(String[] args) {
		
		LearnInheritanceVehicle liv = new LearnInheritanceVehicle();
		liv.applyBrake();
		liv.soundHorn();
	}

}
