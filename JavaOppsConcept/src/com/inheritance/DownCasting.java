package com.inheritance;

public class DownCasting {

	public static void main(String[] args) {
		//downcasting is not possible in java beacuse super class object doesnot have subclass property.
//		SubClass subObj = (SubClass) new SuperClass();
//		subObj.show();
//		subObj.superClassMethod();
//		subObj.subclassMethod();
		
		
		/**
		 * upcasting object can be downcasted
		 * 1. upcasted the object
		 * 2. upcasgted object to downcast
		 */
		SuperClass suprObj = new SubClass();
		suprObj.show();
		suprObj.superClassMethod();
		System.out.println("--------------------------------subclass------------------------------");
		SubClass subclsObj = (SubClass) suprObj;
		subclsObj.subclassMethod();
		
	}

}
