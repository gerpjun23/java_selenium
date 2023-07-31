package jul22.week3.day13.JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class LearnArrayList {

	public static void main(String[] args) {
		
		List<Character> listValues = new ArrayList<Character>();

		System.out.println(listValues.size());
		
		listValues.add('d');
		listValues.add('b');
		listValues.add('c');
		listValues.add('a');
		listValues.add('e');
		listValues.add('a');
		
		System.out.println("====================");
		System.out.println(listValues.size());
		System.out.println("====================");
		
		  for (int i=0; i<listValues.size(); i++) 
		  {
		  
		  System.out.println(listValues.get(i)); 
		  }
		 
		
		//for (datatype variable: ObjectName);
		/*
		 * for (Character value : listValues) { System.out.println(value); }
		 */
		  System.out.println("====================");
		  Collections.sort(listValues);
		  
			
			  for (int i=listValues.size()-1; i>=0; i--) 
			  {
			  
			  System.out.println(listValues.get(i)); 
			  
			  }
		  
		  
		  
		
		listValues.remove(3);
		
		System.out.println(listValues.size());
	}

}
