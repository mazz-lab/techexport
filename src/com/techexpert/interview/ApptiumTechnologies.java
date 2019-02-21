package com.techexpert.interview;

public class ApptiumTechnologies {
	
	public static String sliptAmount(Double amount) {
		String result=Double.toString(amount);
		String [] finalresult=result.split("\\.");
		
		return finalresult[0]+"--"+finalresult[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("sliptAmount."+sliptAmount(1990.2));

	}

}
