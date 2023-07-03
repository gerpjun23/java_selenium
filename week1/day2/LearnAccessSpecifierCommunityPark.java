package jun23.week1.day2;

public class LearnAccessSpecifierCommunityPark {

	public void playArea()
	{
		System.out.println("This is Community Park - Child Play Area");
	}
	
	protected void gym()
	{
		System.out.println("This is Community Park - Gym");
	}
	
	private void car()
	{
		System.out.println("This is Community Park - Car");
	}
	
	void communityTheatre()
	{
		System.out.println("This is Community Park - Community Theatre");
	}
	
	
	public static void main(String[] args) {
		LearnAccessSpecifierCommunityPark lascp = new LearnAccessSpecifierCommunityPark();
		lascp.playArea();
		lascp.gym();
		lascp.car();
		lascp.communityTheatre();
	}

}
