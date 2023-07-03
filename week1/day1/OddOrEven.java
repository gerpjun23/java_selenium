package jun23.week1.day1;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class OddOrEven {
	
	public long a = 2000001000000000000L;
	
	public void oddEven() 
	{
		if(a%2 !=1)
		{
			System.out.println("Numbre:" + a + " is Even number");
		}
			
		else
			System.out.println("Numbre:" + a + " is Odd number");
		
	}

	public static void main(String[] args) {
		
		OddOrEven oddEven = new OddOrEven();
		
		oddEven.oddEven();
		

	}

}
