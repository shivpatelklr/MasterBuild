package com.winsun;

public class MyMain {
	public static void main(String argv)
	{
	int n =5;
	for(int i = 1; i<= n ; i++){
		for(int j = 1; j<= i; j++){
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println("-----------------");
	for(int i = n; i >= n ; i++){
		for(int j = i; j >= i; j++){
			System.out.print(j+" ");
		}
		System.out.println();
	}
	}
}
