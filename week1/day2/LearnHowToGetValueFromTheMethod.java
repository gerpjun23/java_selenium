package jun23.week1.day2;

public class LearnHowToGetValueFromTheMethod {
	
	public String getAddress()
	{
		return "Sudhakar";
	}

	public static void main(String[] args) {
		
		LearnHowToGetValueFromTheMethod lhtgvfm = new LearnHowToGetValueFromTheMethod();
		lhtgvfm.getAddress();
		System.out.println(lhtgvfm.getAddress());
		
	}

}
