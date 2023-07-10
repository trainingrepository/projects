package oopsConcepts;

public class StringOperations {

	public static void main(String[] args) {
		
		String str="abc#$#23asc";
		
		System.out.println("Charecters: " + str.replaceAll("[^a-zA-Z]", ""));
		System.out.println("Numbers :" +str.replaceAll("[^0-9]", ""));
		System.out.println("Special charecters: " +str.replaceAll("[a-zA-Z0-9]", ""));



	}

}
