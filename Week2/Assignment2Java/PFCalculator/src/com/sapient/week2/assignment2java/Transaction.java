package com.sapient.week2.assignment2java;

public class Transaction implements Comparable{
	int eId;
	int cId;
	String sId;
	String tType;
	String tDate;
	int value;
	boolean mark;
	int charges;

	@Override
	public int compareTo(Object o) {

		Transaction tr=(Transaction)o;
		int cIdCompare = this.cId - tr.cId;
		int chargesCompare = this.charges -  tr.charges;
		int tTypeCompare = this.tType.compareTo(tr.tType);
		int tDateCompare = this.tDate.compareTo(tr.tDate);
		if(cIdCompare == 0) {
			if(tTypeCompare == 0) {
				if(tDateCompare == 0)
					return chargesCompare;
				else
					return tDateCompare;
			}
			else {
				return tTypeCompare;
			}
		}
		else {
			return cIdCompare;
		}
	}

		
	@Override
	public String toString() {
		return cId + "," + tType + "," + tDate + "," + ""  + "," + charges + "\n" ;
	}	
		

	

}
