package practice;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		6! = 6*5*4*3*2*1
//		n! = n*(n-1)*(n-2)....*2*1
		
		int i,fact=1;  
		  
		int number=5;		//It is the number to calculate factorial    
		  
		for(i=1;i<=number;i++){    
		  
			  fact=fact*i;    
		      
		}   
		  
		  System.out.println("Factorial of "+number+" is: "+fact);    
	}  

}
