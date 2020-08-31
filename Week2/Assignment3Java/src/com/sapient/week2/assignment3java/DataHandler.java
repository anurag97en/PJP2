package com.sapient.week2.assignment3java;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DataHandler {

	static List<PerCapitaCalculator> logs=new ArrayList<PerCapitaCalculator>();
	static List<PerCapitaCalculator>  results=new ArrayList<PerCapitaCalculator>();
	// Adding Data as per the format
	public static void parseInput(String nextLine) {
		  System.out.println(nextLine);
		  String[] col=nextLine.split(",");
		  logs.add(new PerCapitaCalculator(col[0],col[1],col[2],col[3],Double.parseDouble(col[4])));
	}
	private static boolean containsinfo(String country, String gender) {
		for (Iterator<PerCapitaCalculator> i = logs.iterator(); i.hasNext(); )  {
			if(i.next().getCountry().equals(country) && i.next().getGender().equals(gender)) {
				return true;
			}
		}
		return false;
	}
	private static void addinfo(PerCapitaCalculator info) {
		Double result=0.0;
		int a=0;
		 for (Iterator<PerCapitaCalculator> i = logs.iterator(); i.hasNext(); )  {
			if(i.next().getCountry() == info.getCountry() && i.next().getGender() == info.getGender()) {
				a+=1;
				result += i.next().getAvgIncome();
			}
		}
		results.add(new PerCapitaCalculator(info.getCountry(),info.getGender(),result/a));
	}
	
	public static void calculateResult() {
		for (Iterator<PerCapitaCalculator> i = logs.iterator(); i.hasNext(); )  {
			if(!containsinfo(i.next().getCountry(),i.next().getGender()))
				addinfo(i.next());
		}
	}

	
//Writing into the file
	public static void WriteLogs() {

		String result="";
		try {
		FileWriter fw=new FileWriter("E:\\PJP2\\Week2\\sample_outputs.csv");
		Collections.sort(results);
		
		for(var Output:results)
		{
			result+=results;
		}
		fw.write(result);
		fw.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
