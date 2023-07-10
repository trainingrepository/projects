package oopsConcepts;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Filereadandwrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("c:/Users/kalaiyarasi.a/Desktop/text.txt");
		Scanner scn=new Scanner(file);
		/*
		 * while(scn.hasNextLine()) { System.out.println(scn.nextLine());
		 * 
		 * }
		 */
	String str="";
	
	while(scn.hasNextLine())
	{
str=str.concat(scn.nextLine())+"\n";

FileWriter wtr=new FileWriter("c:/Users/kalaiyarasi.a/Desktop/newtext.txt");
wtr.write(str);
wtr.close();


	}
}
}