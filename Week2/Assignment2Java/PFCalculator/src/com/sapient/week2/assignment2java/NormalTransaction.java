package com.sapient.week2.assignment2java;

public class NormalTransaction extends Transaction {

	public NormalTransaction(int eId, int cId, String tType, String tDate, int value, boolean mark) {
		this.eId=eId;
		this.cId=cId;
		this.tType=tType;
		this.tDate=tDate;
		this.value=value;
		this.mark=mark;
		
		if(mark)
		{
			charges=500;
		}
		else
		{
			if(tType.equals("sell") || tType.equals("withdraw"))
			{
				charges=100;
			}
			else
			{
				charges=50;
			}
		}
		
	}

}
