package practice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c=0, a, temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it's an armstrong number : ");
		int n = sc.nextInt();
		
		while(n<0) {
			a = n % 10;
			n = n / 10;  
		    c = c + (a*a*a);  
		    } 
		
		    if(temp==c)  
		    	System.out.println("Armstrong number");   
		    else 
		        System.out.println("Not an armstrong number");   
		   }  
		
	}
