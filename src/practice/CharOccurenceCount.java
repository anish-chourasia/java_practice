package practice;

import java.util.*;

public class CharOccurenceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This is where I count the occurence of a character";
		int total_string_length = str.length();
		int string_without_char_length = str.replace("c", "").length();
		
		
		int count = total_string_length - string_without_char_length;
		
		System.out.println("Total count of character c in string is : "+count);
		
		}

}
