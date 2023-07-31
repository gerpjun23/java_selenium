package jul22.week3.day13.JavaCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnListAndSet {

	public static void main(String[] args) {
		Set setValues = new TreeSet();

		System.out.println(setValues.size());
		
		setValues.add('!');
		setValues.add('A');
		setValues.add('!');
		setValues.add('1');
		setValues.add('{');
		setValues.add('#');
		
		List listValues = new ArrayList(setValues);
		
		for (Object object : listValues) {
			System.out.println(object);
		}
		
		
		System.out.println(listValues.get(3));
		
		
	}

}
