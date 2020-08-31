package com.sapient.week2.assignment3java;

public class MainCalculator {

	public static void main(String[] args) {
		
		
		
		 String inputfile="E:\\PJP2\\Week2\\sample_inputs.csv";
	     InputRead.readinput(inputfile);
	     DataHandler.calculateResult();
	     DataHandler.WriteLogs();

	}

}
