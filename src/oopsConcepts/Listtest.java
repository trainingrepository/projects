package oopsConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Listtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> friends=new ArrayList<>(Arrays.asList("vidhya"));
		friends.add(0, "anu");
		friends.add(1, "sent");
		friends.add(2, "krish");
		
		Set<String> name=new HashSet<>();

System.out.println(friends);

Object[] array = friends.toArray();
Arrays.sort(array);
System.out.println(array.toString());
	
		//List<String> friends1=new ArrayList<>(friends.addAll(0, friends));

	}

}
