package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Using hashmap : key-value pair
		
		System.out.println("Enter a string to check duplicate characters : ");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		char[] arr = str.toCharArray(); // storing strings in characters array
		
		Map<Character , Integer> map = new HashMap<Character,Integer>(); // making an object of hashmap
		
		int count = 1; //default count for all characters
		
		for (int i = 0 ; i <arr.length ; i ++)	{
			if (!map.containsKey(arr[i]))	{
				map.put(arr[i], count);
			}
			else
				map.put(arr[i], map.get(arr[i])+1);
		}	
		
//		printing duplicates from hasmap
		for(Character key : map.keySet())	{
			if(map.get(key)>1)
				System.out.println(key+ " : "+map.get(key));
		}
		
	}	
		
}

