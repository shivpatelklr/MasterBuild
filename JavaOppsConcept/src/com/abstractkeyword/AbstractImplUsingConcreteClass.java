package com.abstractkeyword;

class AbstractImplUsingConcreteClass extends AbstarctClass {	
	
	public static void main(String[] args) {
		AbstractImplUsingConcreteClass concreteObj = new AbstractImplUsingConcreteClass();
		concreteObj.defaultAccessSpecifier();		
	}
}

abstract class AbstarctClass {
	/**
	 * Cannot instantiate the type AbstractImplementation
	 * AbstractImplementation abstractObj = new AbstractImplementation();
	 */		
	void defaultAccessSpecifier() {
		System.out.println("Abstract: may or may not be contains method declaration. creating abstract keyword is optional"
				+ " when we use the given class as abstract then we cannot able create object");
	}
}
