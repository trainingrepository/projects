package oopsConcepts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Filereadandwrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader file1=new BufferedReader(new FileReader("c:/Users/kalaiyarasi.a/Desktop/text.txt"));
		file1.readLine();
		String line;
		while((line=file1.readLine()) != null)
		System.out.println(line);
		/*String line:
	While ((line=file1.readLine()) !=null);
		{
			System.out.println("file check:"+file1);
		}*/
		
		file1.close();
		
	
	
	BufferedWriter wrt= new BufferedWriter(new FileWriter("new.txt"));
	wrt.write("\n"+line);
	wrt.close();
	System.out.println("written sucess");
	
	}
	
}