package practice;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int rev_num =0 , remainder;

		int org_num = num;		    // store the number to original num
		
		
//		 get the reverse of original num
//	     store it in variable
		while(num != 0) {
			remainder=num % 10;						// 3553 % 10 = 3  ; 355 % 10 = 5 ; 	  35 % 10 = 5 ;		  3 % 10 = 3
			
			rev_num = rev_num * 10 + remainder;     // 0 * 10 + 3 = 3 ; 3 * 10 + 5 = 35 ; 35 * 10 + 5 = 355 ; 355 * 10 + 3 = 3553 -> rev_num returned
			
			num=num / 10;							// 3553 / 10 = 355 ; 355 / 10 = 35 ;  35 / 10 = 3 ;		  3 / 10 = <0
			
		}
		
		if(org_num==rev_num)
			System.out.println(org_num+ " is a palindrome");
		else
			System.out.println(org_num+ " is not a palindrome");

		
		
	}

}
