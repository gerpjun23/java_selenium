package jun23.week1.day2;

public class LearnArrays {

	public static void main(String[] args) {
		
		//array syntax: dataType[] variableName = new dataType[value]
		
		int[] nums = new int[6]; //size
		int[] age = {10,20,30,40,50,60}; //value
		
		//memory - age[0] = 10; age[1] = 20; age [2] = 30; age[3]=40; age[4]=50; age[5]=60;
		
		//Ctrl+2+L
		//int arrayLength = age.length;
		//System.out.println(arrayLength);
		
		System.out.println(age.length);
		
		int ageIndex = age.length-1;
		System.out.println(ageIndex);
		
		
		
		nums[5]=6;
		nums[1]=2;
		nums[0]=1;
		nums[3]=4;
		nums[4]=5;
		
		//to get the last index
		System.out.println(nums[ageIndex]);
		
		System.out.println(nums[0]);
		
		for (int i=(nums.length)-1; i>=0; i--)
			
		{
			System.out.println(nums[i]);
		}
		
		
		
		
		
		
		

	}

}
