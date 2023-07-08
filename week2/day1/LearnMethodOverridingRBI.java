package jun23.week2.day1;

public class LearnMethodOverridingRBI {

	public void goldLoan(int accNumber, double loanBalance)
	{
		System.out.println("RBI - Hi, Your account Number is : " + accNumber + "and your loanBalance is : " + loanBalance);
	}
	
		
	public void lineOfCredit(int accNumber, double locBalance)
	{
		System.out.println("RBI - Hi, Your account Number is : " + accNumber + "and your locBalance is : " + locBalance);
	}
	
	public static void main(String[] args) {
		LearnMethodOverridingRBI lmor = new LearnMethodOverridingRBI();
		lmor.goldLoan(101, 10000.00);
		lmor.goldLoan(101, 25000.00);
	}

}
