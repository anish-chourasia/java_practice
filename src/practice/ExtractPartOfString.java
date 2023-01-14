package practice;

import java.util.Scanner;

public class ExtractPartOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println("Enter end index for initial part of string :");
		int initialPartEnd = sc.nextInt();
		
		String firstPartString = str.substring(0, initialPartEnd); // EndIndex 4 is exclusive so it would store strings from 1st character (0) to 4th character (3) not till 5th
		System.out.println(firstPartString);

		System.out.println("Enter start index for last part of string :");
		int lastPartStart = sc.nextInt();

		
		String lastPartString = str.substring(str.length() - lastPartStart, str.length());
		
		System.out.println(lastPartString);
	}

}
