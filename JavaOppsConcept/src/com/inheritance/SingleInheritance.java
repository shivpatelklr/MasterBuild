package com.inheritance;

public class SingleInheritance {

	public static void main(String[] args) {
		SuperClass supObj = new SuperClass();
		supObj.show();
		
		
		SubClass subObj = new SubClass();
		subObj.show();
	}

}

class SuperClass{
	
	public void show() {
		System.out.println("super class method called");
	}
	
	public void superClassMethod() {
		System.out.println("super class method called which is not present in subclass");
	}
}

class SubClass extends SuperClass{
	@Override
	public void show() {
		System.out.println("sub class method called");
	}
	
	public void subclassMethod() {
		
	System.out.println("subclassMethod called but not present in super class");
		
	}
}
