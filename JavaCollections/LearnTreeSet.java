package jul22.week3.day13.JavaCollections;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {

	public static void main(String[] args) {
		Set setValues = new TreeSet();

		System.out.println(setValues.size());
		
		setValues.add('!');
		setValues.add('A');
		setValues.add('!');
		setValues.add('1');
		setValues.add('{');
		setValues.add('#');
		
		System.out.println(setValues.size());
		
				
		 for (Object value : setValues) {
			 System.out.println(value);
			
		}
		
	//	setValues.remove(3);
		
		 
		System.out.println(setValues.size());
	}

}
