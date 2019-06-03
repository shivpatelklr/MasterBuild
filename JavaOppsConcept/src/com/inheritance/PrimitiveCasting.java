package com.inheritance;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		short srtvalue =1000;
		int iValue = srtvalue;
		System.out.println("---------widining--------");
		System.out.println("srtvalue: "+srtvalue);
		System.out.println("iValue: "+iValue);
		
		//widining is autocasting
		//narrowing, we need to manually cast the data type
		short srtVal = (short) iValue;
		System.out.println("---------------narrowing ---------------");
		System.out.println("conversion of int value to short: "+srtVal);
		
		int iNumber = 500000;
		short srtNumber = (short) iNumber;
		System.out.println("--------------- while narrowing we can loss of data---------------");
		System.out.println("int value: "+iNumber);
		System.out.println("conversion of int value to short: "+srtNumber);
	}

}
