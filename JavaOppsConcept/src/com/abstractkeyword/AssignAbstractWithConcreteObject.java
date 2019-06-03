package com.abstractkeyword;

class AssignAbstractWithConcreteObject extends AbstarctClassWithDecalreMethod{
	
	void defaultAccessSpecifier() {
		System.out.println("abstract defaultAccessSpecifier method implementation");
	}
	
	void methodDeclaration() {
		System.out.println("abstract methodDeclaration method implementation");
	}
	
	public static void main(String[] args) {
		AbstarctClassWithDecalreMethod abstractObj = new AssignAbstractWithConcreteObject();
		abstractObj.defaultAccessSpecifier();
		abstractObj.methodDeclaration();
	}
}

abstract class AbstarctClassWithDecalreMethod {
	/**
	 * Cannot instantiate the type AbstractImplementation
	 **/		
	abstract void defaultAccessSpecifier();
	abstract void methodDeclaration();
}

