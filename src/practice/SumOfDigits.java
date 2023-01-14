package practice;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0; int remainder;
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		for(int i = num ; i >=0 ; i--)	{
		
			remainder = num % 10 ;
			sum = sum + remainder;
			num = num / 10;
		}
		
		System.out.println(sum);
	}

}
