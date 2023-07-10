package oopsConcepts;
import java.util.*;
public class Prob1 {

	public static void main(String[] args) {
		// for a given n ,find the nearest number divisable by 10 that is<=n
		
		/*pseudo
		 * get the number from user using scanner
		 * store the given number to variable n
		 * check whether the given number is divisbale by 10,if yes print the number and exit
		 * else decrement the n value and check till 1

*/
		
		int n;
		System.out.println("enter the number:");
		Scanner scn=new Scanner(System.in);
		n=scn.nextInt();
		
		for (int i = n; i>=1 ; i--) {
			
			if(i%10==0)
			{
				System.out.println(i);
				break;
			}
			}
		}
		
		
	}


