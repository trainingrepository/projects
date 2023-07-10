package oopsConcepts;
import java.util.*;

public class Loopcontrol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n;
		System.out.println("enter the number: ");
		Scanner scn=new Scanner(System.in);
		n=scn.nextInt();
		//System.out.println(n);
		
		while (n>=0) {
		if(n%10==0)
		{
				
			System.out.println(n);
			break;
		}
		n--;
		}
		
	}
}


