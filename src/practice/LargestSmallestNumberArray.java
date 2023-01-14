package practice;

import java.util.Arrays;

public class LargestSmallestNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] numbers = {5,-2,6,3,9,-234,25,7,2}; 
		
//		assume that 0th index in array is the largest and smallest. reference point to compare each number
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
//		loop starts from i=1 since i=0 has already been assigned as reference point
//		array starts from 0 and goes till length-1
		
		for(int i =1 ; i<numbers.length ; i++) {
			if(numbers[i] > largest)
				largest = numbers[i];
			else if (numbers[i] < smallest)
				smallest = numbers[i];
		}
		
		System.out.println(Arrays.toString(numbers));
		System.out.println("Largest : "+largest);
		System.out.println("Smallest : "+smallest);
		
	}

}
