package oopsConcepts;

public class Swap2numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=20,temp=0;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("a= :"+a +"b= "+b);
		
		//without using 3rd variable
		
		int a1=10,b1=20;
		
		a1=a1+b1;
		b1=a1-b1;
		a1=a1-b1;
		System.out.println(+a1 +"and" +b1);
		
		


	}

}
