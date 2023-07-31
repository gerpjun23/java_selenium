package jul22.week3.day13.JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSortingUsingCollection {

	public static void main(String[] args) {
		//String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		
		Set<String> setValues = new TreeSet<String>();
		
		setValues.add("HCL");
		setValues.add("Wipro");
		setValues.add("Aspire Systems");
		setValues.add("CTS");
		
		System.out.println(setValues);
		
		List listValues = new ArrayList(setValues);
		
		Collections.sort(listValues);
		
		for (int i=listValues.size()-1; i>=0; i--)
		{
			System.out.print(listValues.get(i));
		}
	}

}
