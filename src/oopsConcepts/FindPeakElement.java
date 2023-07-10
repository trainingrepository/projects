package oopsConcepts;

import java.util.Arrays;

public class FindPeakElement {

	public static void main(String[] args) {
		// Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors. 
		
		int[] num= {5, 10, 20, 15};
		int temp = 0;
		
		Arrays.sort(num);
		
		System.out.println(num[0]);
		
		
		int num1[]={40, 10, 20, 15};
		
		for (int i = 0; i < num1.length-1; i++) {
			
			for (int j = 1; j < num1.length-1; j++) {
				if(num1[i]>num1[j])
				{
					 temp=num1[j];
					num1[j]=num1[i];
					num1[i]=temp;
				
				}
				
			}
			
			System.out.println(num1[i]);

		
			
			
		}

	}

}
