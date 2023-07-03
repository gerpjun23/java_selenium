package jun23.week1.day1;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class LogicalOperator {

	int a = 2;
	int b = 2;
	int c = 4;
	int d = 5;
	
	public void logOp()
	{
		if (a!=b || c!=d)
		{
			System.out.println("None of the condition is equal");
		}
		
		else 
			System.out.println("either one of the condition is equal");
	}
	
	public static void main(String[] args) {
		LogicalOperator logOperator = new LogicalOperator();
		logOperator.logOp();
	}
}
