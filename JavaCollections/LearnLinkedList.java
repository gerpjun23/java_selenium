package jul22.week3.day13.JavaCollections;

import java.util.LinkedList;
import java.util.List;

public class LearnLinkedList {

	public static void main(String[] args) {
		
		List<Integer> listValues = new LinkedList<Integer>();

		System.out.println(listValues.size());
		
		listValues.add(100);
		listValues.add(200);
		listValues.add(300);
		listValues.add(400);
		listValues.add(500);
		listValues.add(100);
		
		System.out.println(listValues.size());
		
		
		  for (int i=0; i<listValues.size(); i++) 
		  {
		  System.out.println(listValues.get(i)); 
		  }
		 
		
		//for (datatype variable: ObjectName);
		for (Integer value : listValues) {
			System.out.println(value);
		}
		
		
		listValues.remove(3);
		
		System.out.println(listValues.size());
	}

	
}
