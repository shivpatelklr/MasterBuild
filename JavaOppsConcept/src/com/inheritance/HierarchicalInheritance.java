package com.inheritance;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		SubHierarchical1 subHierarObj1 = new SubHierarchical1();
		subHierarObj1.show();
		
		SubHierarchical2 subHierarObj2 = new SubHierarchical2();
		subHierarObj2.show();
		
		SubHierarchical3 subHierarObj3 = new SubHierarchical3();
		subHierarObj3.show();
	}
}
	
	class SubHierarchical1 extends SuperClass{
		@Override
		public void show() {
			System.out.println("SubHierarchical1 class show method");
		}
	}
	
	class SubHierarchical2 extends SuperClass{
		@Override
		public void show() {
			System.out.println("SubHierarchical2 class show method");
		}
	}
	
	class SubHierarchical3 extends SuperClass{
		@Override
		public void show() {
			System.out.println("SubHierarchical3 class show method");
		}
	}
