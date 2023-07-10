package oopsConcepts;
import java.util.Scanner;
import java.util.concurrent.*;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double n,sum=0;
		System.out.println("enter the number:");
		Scanner scn=new Scanner(System.in);
		
		while(true)
		{
			n=scn.nextDouble();
			if(n<0.0)
			{
			System.out.println("exited");
			break;
		}
			
			sum=sum+n;
			
	

}
		System.out.println(sum);
		
	}
}
