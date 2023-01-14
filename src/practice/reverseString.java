package practice;

import java.util.Scanner;

public class reverseString {

	public static void main(String args[])	{
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input String to Reverse :");
		
		String a = input.nextLine();

// Way 1 : 		
//		for ( int i = a.length()-1 ; i>=0 ; i--)	{
//			
//			System.out.print(a.charAt(i));
//		}
		
		
// Way 2 :
		String reverseStr = "";
		for(int i=a.length()-1 ; i>=0 ; i--) {
			reverseStr = reverseStr + a.charAt(i);
		}
		System.out.print(reverseStr);

	}
	
	
}
