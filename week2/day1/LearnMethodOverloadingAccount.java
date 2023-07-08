package jun23.week2.day1;

public class LearnMethodOverloadingAccount {

	//@Overload - Method Name: same (savingAccount()) but Argumber: Differs (a) no argument b) int) 
	public void savingAccount()
	{
		System.out.println("This is the saving account");
	}
	
	public void savingAccount(int accNumber)
	{
		System.out.println("You Saving Account Number is :" +accNumber);
	}
	
	public void savingAccount(int accNumber, String accName)
	{
		System.out.println("Hi " + accName + " Your Account Number is: " + accNumber);
	}
	
	public void savingAccount(int accNumber, double accBalance)
	{
		System.out.println("Hi AccountNumber: " + accNumber + " Your available Balance is: " + accBalance);
	}
	
	public static void main(String[] args) {
		LearnMethodOverloadingAccount lmola = new LearnMethodOverloadingAccount();
		lmola.savingAccount();
		lmola.savingAccount(101);
		lmola.savingAccount(101, "Sudhakar");
		lmola.savingAccount(101, 10000);

	}

}
