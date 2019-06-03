package com.abstractkeyword;

public class AbstractWithDefineAndDefinition extends AbstractClassDeclaration {
	
	public static void main(String[] args) {
		
		AbstractClassDeclaration abstractObj = new AbstractWithDefineAndDefinition();
		abstractObj.showImpl();
		abstractObj.showDeclare();
	}
	
	public void showDeclare() {
		System.out.println("Implementation of abstract method implementation");
	}
	
}


abstract class AbstractClassDeclaration {	
	/**
	 * abstract class may contain may be method declaration and method implementation
	 */
	public void showImpl() {
		System.out.println("abstract method implementation");
	}
	public abstract void showDeclare();
	
}
