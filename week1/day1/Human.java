package jun23.week1.day1;

public class Human {

	public void canTalk() {
		System.out.println("canTalk");

		String voice = "Louder";
		System.out.println(voice);
		int mouth = 1;
		System.out.println(mouth);
		
	}
	
	public void canWalk()
	{
		System.out.println("Human can walk");
		String speed = "faster";
		System.out.println(speed);
		int legs = 2;
		System.out.println(legs);
	}
	
	
	public static void main(String[] args) {
		
		Human ramesh = new Human();
		ramesh.canTalk();
		ramesh.canWalk();

	}

}
