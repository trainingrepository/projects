package oopsConcepts;

public class Continue {

	public static void main(String[] args) {
		// print all numbers less than 100 except numbers divisible by 4 and 6 use continue
		
		
		/*pseudo
		 * 
		 */
		
		int n=100;

		for (int i = 1; i<n; i++) {

			if (i%4==0 && i%6==0) 
				continue;
				System.out.println(i);

			
		}
	}

}
