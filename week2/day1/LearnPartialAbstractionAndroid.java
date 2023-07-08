package jun23.week2.day1;

public class LearnPartialAbstractionAndroid extends LearnPartialAbstractionMobile implements LearnFullAbstractionMobile, LearnInterfacePager 

{

	public void whatsApp() {
		System.out.println("Whats is ready for implementation");
		
	}
	
	public void pager() {
		System.out.println("This is pager");
		
	}
	

	public void takeVideo() {
		// TODO Auto-generated method stub
		
	}

	public void sendMessage() {
		// TODO Auto-generated method stub
		
	}

	public void makeCall() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		LearnPartialAbstractionAndroid lpaa = new LearnPartialAbstractionAndroid();
		
		lpaa.makeCall();
		lpaa.sendMessage();
		lpaa.takeVideo();
		lpaa.whatsApp();
		lpaa.pager();
		lpaa.whatsApp();
	}


	

	

}
