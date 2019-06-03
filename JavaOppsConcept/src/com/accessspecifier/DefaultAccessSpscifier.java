package com.accessspecifier;

class DefaultAccessSpscifier {

	String strMsg = "welcome";


	public static void main(String[] args) {
		
		//creating object  and calling inside class
		DefaultAccessSpscifier defaultObj = new DefaultAccessSpscifier();
		defaultObj.show();
		System.out.println("strMsg: "+defaultObj.strMsg);
		
		//creating object which is present outside the class
		InsidePackageLevel samePackageObj = new InsidePackageLevel();
		samePackageObj.insideShow();
		System.out.println("---------------------:"+samePackageObj.strHelloMsg);
		
		/**
		 * creating the class object which is present in outside the package
		 * Deafult access specifier can able to access only for same package
		 */
		//AbstractImplUsingConcreteClass absObj = new AbstractImplUsingConcreteClass();
		
	}
	
	void show() {
		System.out.println("Default Access Spcifier method");
	}
}


class InsidePackageLevel{
		
	String strHelloMsg = "Hello welcome to winsun";
	void insideShow() {
		System.out.println("Default Access Spcifier with insideShow method");
	}
}
