package oopsConcepts;

public class MaxMinofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {56,89,76,23,90};
		int target=179;
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 1; j < num.length-1; j++) {
				if(num[i]+num[j]==target)
				{
					System.out.println("target is reached" + "by adding" + num[i]+"&"+ num[j]);
			}
		}

	}
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 1; j < num.length-1; j++) {
				if(num[i]>num[j])
				num[i]=num[j];

				
			}

			
			
		}
}
}
