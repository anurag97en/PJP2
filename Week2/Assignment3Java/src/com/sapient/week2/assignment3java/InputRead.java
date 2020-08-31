package com.sapient.week2.assignment3java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;



public class InputRead {
	public static void readinput(String inputfile)
	{
		
		try {
			File file=new File(inputfile);
			FileReader fr=new FileReader(file);
			Scanner sc=new Scanner(fr);
			while(sc.hasNextLine())
		    {
		    	DataHandler.parseInput(sc.nextLine());
		    	
		    }
		    sc.close();
}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}}
