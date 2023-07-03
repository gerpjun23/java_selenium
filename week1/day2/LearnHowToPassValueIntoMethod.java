package jun23.week1.day2;

public class LearnHowToPassValueIntoMethod {
	
	
	public void playHorn(String name, int age)
	{
		System.out.println("My name is: " + name);
		System.out.println("My age is: " + age);
	}
	
	public void student(int rollnumber, int marks)
	{
		System.out.println("My Rollnumber is: " + rollnumber);
		System.out.println("My marks is: " + marks);
	}

	public static void main(String[] args) {
		
		LearnHowToPassValueIntoMethod lhtpvim = new LearnHowToPassValueIntoMethod();
		lhtpvim.playHorn("Sudhakar", 26);
		lhtpvim.student(1010, 80);

	}

}
