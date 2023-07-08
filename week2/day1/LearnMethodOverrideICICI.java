package jun23.week2.day1;

public class LearnMethodOverrideICICI extends LearnMethodOverridingRBI {
	
	@Override
	public void goldLoan(int accNumber, double loanBalance)
	{
		System.out.println("RBI - Hi, Your account Number is : " + accNumber + "and your loanBalance is : " + loanBalance);
	}
	
	public void goldLoan()
	{
		System.out.println("RBI - Hi, Your account Number is : ");
	}
	
	public void lineOfCredit(int accNumber, double locBalance)
	{
		System.out.println("RBI - Hi, Your account Number is : " + accNumber + "and your locBalance is : " + locBalance);
	}

	public static void main(String[] args) {
		LearnMethodOverrideICICI lmoi = new LearnMethodOverrideICICI();
		lmoi.goldLoan(101, 20000);
		lmoi.lineOfCredit(102, 50000);
		lmoi.goldLoan();

	}

}
