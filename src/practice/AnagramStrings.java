package practice;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="qwsdfr";
		String str2="mAry";
		
		
		if(str1.contains("a")||str1.contains("e")||str1.contains("i")||str1.contains("o")||str1.contains("u"))
			System.out.println("true");
		else
			System.out.println("false");
		
//		converting strings to character array
		
		char[] arr1=str1.toLowerCase().toCharArray();
		char[] arr2=str2.toLowerCase().toCharArray();
		
//		sorting the arrays
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2))
			System.out.println("Strings are anagram strings");
		else
			System.out.println("Strings are not anagram strings");
		
	}

}
