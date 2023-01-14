package practice;

import java.util.Scanner;

public class Swap2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y , temp ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("First num : ");
		x=sc.nextInt();
		System.out.println("Second num : ");
		y=sc.nextInt();
		
		System.out.println("Before swapping : " +x+ " , "+y);
//		temp=x;
//		x = y ;
//		y = temp ;
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("After Swapping : "+x+" , "+y);
        
		
		
	}

}
