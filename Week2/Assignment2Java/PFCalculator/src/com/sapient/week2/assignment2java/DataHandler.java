package com.sapient.week2.assignment2java;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DataHandler {
	
	// After reading input file making array of logs to shortlist transactions type
	static List<Transaction> Logs=new ArrayList<Transaction>();
			
	public static void parseInput(String record) {
	  System.out.println(record);
	  String[] arr=record.split(",");
	  if(arr[2].equals(""))
	  {
		  Logs.add(new NormalTransaction(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),arr[3],arr[4],Integer.parseInt(arr[5]),arr[6] == "Y" ? true : false));
	  }
	  else
	  {
		  Logs.add(new IntradayTransaction(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),arr[2],arr[3],arr[4],Integer.parseInt(arr[5])));
	  }	
	}
  // Writing to output csv file
	public static void WriteLogs()
	{
		String result="";
		try {
		FileWriter fw=new FileWriter("E:\\SapientPJP2\\sample_output.csv");
		Collections.sort(Logs);
		
		for(Transaction tr:Logs)
		{
			result+=tr;
		}
		fw.write(result);
		fw.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
