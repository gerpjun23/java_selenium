package jul22.week3.day13.JavaCollections;

import java.util.HashSet;
import java.util.Set;

public class LearHashSet {

	public static void main(String[] args) {
		Set<Integer> setValues = new HashSet<Integer>();

		System.out.println(setValues.size());
		
			
		setValues.add(600);
		setValues.add(100);
		setValues.add(300);
		setValues.add(400);
		setValues.add(100);
		setValues.add(500);
		
		
		System.out.println(setValues.size());
		
		/*
		 * for (int i=0; i<listValues.size(); i++) {
		 * 
		 * System.out.println(listValues.get(i)); }
		 */
		
		//for (datatype variable: ObjectName);
		for (Integer value  : setValues) {
			System.out.println(value);
		}
		
		
		setValues.remove(0);
		
		System.out.println(setValues.size());
		
		for (Integer value  : setValues) {
			System.out.println(value);
		}
		
		
	}
	
}
