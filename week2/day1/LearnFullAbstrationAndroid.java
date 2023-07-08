package jun23.week2.day1;

public class LearnFullAbstrationAndroid implements LearnFullAbstractionMobile {

	public void takeVideo() {
	
		System.out.println("This is takeVideo of Android");
	}

	
	public void sendMessage() {
		System.out.println("This is sendMessage of Android");
		
	}

	public void makeCall() {
		System.out.println("This is makeCall of Android");
		
	}
	
	public static void main(String[] args) {
		LearnFullAbstrationAndroid lfaa = new LearnFullAbstrationAndroid();
		lfaa.takeVideo();
		lfaa.sendMessage();
		lfaa.makeCall();

	}

	

}
