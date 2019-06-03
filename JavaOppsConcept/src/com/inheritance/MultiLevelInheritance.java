package com.inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		SubClass2 subObj = new SubClass2();
		subObj.show();

	}
}
	
	class BaseClass{
		
		public void show() {
			System.out.println("super class method");
		}
	}

	class SubClass1 extends BaseClass{
		@Override
		public void show() {
			System.out.println("sub class1 method");
		}
	}
	
	class SubClass2 extends SubClass1{
		@Override
		public void show() {
			System.out.println("sub class2 method");
		}
	}
