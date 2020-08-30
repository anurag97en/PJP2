package com.sapient.week2.assignment2java;

public class IntradayTransaction extends Transaction {

	

	public IntradayTransaction(int eId, int cId, String sId, String tType, String tDate,
			int value) {
		
		this.eId=eId;
		this.cId=cId;
		this.sId=sId;
		this.tType=tType;
		this.tDate=tDate;
		this.value=value;
		this.charges=10;
		
	}

}
