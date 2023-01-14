package practice;

import java.util.Scanner;

public class SumOfNumbersInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number in range : ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number in range : ");
		int num2 = sc.nextInt();
		
		int sum = 0 ;
		
		for(int i = num1 ; i<=num2; i++) {
			
			sum = sum + i ;
		}
		
		System.out.println("Sum of numbers between "+num1+ " and "+num2+ " is :"+sum);
		
		
	}

}
