package practice;

import java.util.Scanner;

public class PrimeNumbersInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter lower range value :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter greater range value :");
		int num2 = sc.nextInt();
		
		
		for(int n=num1;n<=num2;n++) {
            //check if this number is prime
            if(isPrime(n)) {
                System.out.println(n);
            }
        }
		
	}
	
	public static boolean isPrime(int num) {    
        for(int i = 2; i <= num/i; ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }


}
