package jul22.week3.day13.JavaCollections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {

	public static void main(String[] args) {
		Set<Integer> setValues = new LinkedHashSet<Integer>();

		System.out.println(setValues.size());
		
		setValues.add(500);
		setValues.add(200);
		setValues.add(700);
		setValues.add(100);
		setValues.add(100);
		setValues.add(300);
		
		System.out.println(setValues.size());
		
		/*
		 * for (int i=0; i<listValues.size(); i++) {
		 * 
		 * System.out.println(listValues.get(i)); }
		 */
		
		//for (datatype variable: ObjectName);
		for (Integer value : setValues) {
			System.out.println(value);
		}
		
		
		setValues.remove(3);
		
		System.out.println(setValues.size());
	}

	
}
