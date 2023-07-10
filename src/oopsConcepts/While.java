package oopsConcepts;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		System.out.println("enter the number:");
		Scanner scn=new Scanner(System.in);
		n=scn.nextInt();
		l1:
			while(true)
				l2:
			for (int i = n; i>=1; i--) {
				
				if (i%10==0) {
					System.out.println(i);
					break l2;
				}
				
			}

	}

}
