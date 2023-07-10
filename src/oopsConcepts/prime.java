package oopsConcepts;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*pseudo
		 * get the number from user/initialize one number
		 * initialize one count
		 * divide the given number from one to that number
		 * if divided increase count
		 * if count>2 its not prime
		 */
		
		int n,count=0;
		System.out.println("enter the number:");
		Scanner scn=new Scanner(System.in);
		n=scn.nextInt();
		for (int i = 2; i <n; i++) {
			
			if (n%i==0) {
				
				count+=1;
				if (count==1) {
					System.out.println("not a prime");
					break;
				}
				
			}
			System.out.println("prime");
			
		}
	}

}
