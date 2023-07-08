package jun23.week2.day1;

public abstract class LearnPartialAbstractionMobile {

	//implemented method
	public void takeVideo()
	{
		System.out.println("Hi, Take a Video");
	}
	
	//implemented method
	public void sendMessage()
	{
		System.out.println("Hi, Send a Message");
	}
	
	//implemented method
	public void makeCall()
	{
		System.out.println("Hi, Make a Call");
	}
	
	//unimplemented method s- should have public abstract void
	public abstract void whatsApp();
	
	public abstract void pager();
			
}
