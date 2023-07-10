package oopsConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AraayandAraaylist {

	public static void main(String[] args) {
//Array initialization
		String[] friends= {"gom","vini","krish","niki"};
		
		System.out.println(friends[0]);
		
		//print all
		
		for (int i = 0; i < friends.length; i++) {
			System.out.println(friends[i]);
			
		}
		//arraylist
		ArrayList<String> friends1=new ArrayList<>( Arrays.asList("gom","vini","krish","niki"));
		
		Iterator<String> itr=friends1.iterator();
		if(itr.hasNext())
			System.out.println(" itr elements" +friends1);
		
		for (int i = 0; i < friends.length; i++) {
			System.out.println(friends1.get(i));
		}

		System.out.println(friends1.size());
		
		friends1.add(4, "ketki");
		System.out.println(friends1.size());
		System.out.println(friends1.get(0));

		List<String> friends2=new ArrayList<>();
		friends2.add("jzsgjdz");
		Iterator<String> itr1=friends2.iterator();
		if(itr1.hasNext())
		System.out.println("frids2: "+ friends2);
	}
	



}

