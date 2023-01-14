//PALINDROME : VALUE SAME WHEN REVERSED

package practice;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Method 2 : 
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String reverseStr="";
		int strLen = str.length();
		for(int i=strLen-1 ; i>=0 ; i--)
			reverseStr=reverseStr + str.charAt(i);
		if(str.equals(reverseStr))
			System.out.println("Provided string is a palindrome");
		else
			System.out.println("Provided string is not a palindrome");
		
		
		
		
		
// Method 1 : 
//		if(isStringPalindrome("civi"))	{
//			System.out.println("Given string is a palindrome");
//		}
//		else
//			System.out.println("Not a palindrome. Try another string!");
		
	}

//	public static boolean isStringPalindrome (String str) {
//		if(str==null)
//			return false;
//		int strLength = str.length();
//		System.out.println(strLength/2);
//		for(int i=0 ; i < strLength/2 ; i++)	{
//			if(str.charAt(i)!=str.charAt(strLength - i - 1))
//				return false;
//			}
//		return true;
//		
//	}
	
}
