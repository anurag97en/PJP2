package com.sapient.week2.assignment3java;

import java.util.HashMap;

public class PerCapitaCalculator implements Comparable {
	String city;
	String country;
	String gender;
	String currency;
	Double avgIncome;
	
	final HashMap<String, Double> map  = new HashMap<String, Double>(){
			{
		put("INR",66.0);
		put("GBP",0.67);
		put("SGD",1.5);
		put("HKD",8.0);
			}
	};
	
	public PerCapitaCalculator(String city, String country, String gender, String currency, Double avgIncome) {
		super();
		
		if(country.equals("")) 
			this.country = city;
		else
			this.country = country;
		this.city = city;
		this.country = country;
		this.gender = gender;
		this.currency = currency;
		this.avgIncome = avgIncome/map.get(currency);
	}

	public PerCapitaCalculator( String country, String gender,  Double avgIncome) {
		super();
		this.city = city;
		this.country = "";
		this.gender = gender;
		this.currency = "";
		this.avgIncome = avgIncome;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getAvgIncome() {
		return avgIncome;
	}

	public void setAvgIncome(double avgIncome) {
		this.avgIncome = avgIncome;
	}



	@Override
	public String toString() {
		return country + "," + gender + "," + avgIncome + "\n";
	}

	@Override
	public int compareTo(Object o) {
		PerCapitaCalculator now = (PerCapitaCalculator)o;
		int genderCompare = this.getGender().compareTo(now.getGender());
		int incomeCompare = Double.compare(this.getAvgIncome(),now.getAvgIncome());
		int countryCompare = this.getCountry().compareTo(now.getCountry());
		if(countryCompare == 0) {
			if(genderCompare == 0) {
				return incomeCompare;
			}
			else {
				return genderCompare;
			}
		}
		else {
			return countryCompare;
		}
	}
}
