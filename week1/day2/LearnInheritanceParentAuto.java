package jun23.week1.day2;

public class LearnInheritanceParentAuto extends LearnInheritanceVehicle {
	
	public void handStarter()
	{
		System.out.println("This is Parent Class - HandStarter Method");
	}

	public static void main(String[] args) {
		LearnInheritanceParentAuto lipa = new LearnInheritanceParentAuto();
		lipa.handStarter();
		lipa.applyBrake();
		lipa.soundHorn();

	}

}
