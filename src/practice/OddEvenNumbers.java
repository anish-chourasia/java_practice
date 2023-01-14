package practice;

import java.util.Scanner;

public class OddEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter min value of the range : ");
		int min_val = sc.nextInt();
		
		System.out.println("Enter max value of the range : ");
		int max_val = sc.nextInt();

		
		System.out.println("Even numbers in range of "+min_val+" and "+max_val+" : ");

		for (int i = min_val ; i <=max_val ; i++)	{
			
			if (i % 2 ==0)	{
				System.out.println(i);

			}
		}		
			
			
		System.out.println("Odd numbers in range of "+min_val+" and "+max_val+" : ");
	
		for (int i = min_val ; i <=max_val ; i++)	{
				
				if (i % 2 ==1)	{
					System.out.println(i);

				}	
			
			
		}

}
}