package com.demo.overload;

public class Overloader {

	public static void main(String[] args) {
		
		DoSomethingWithNumbers multiply = (int a, int b) -> a * b;
		// data type is not necessary since lambda will find the type with the value
		DoSomethingWithNumbers add = (a, b) -> a + b;

		Overloader overloader = new Overloader();
		System.out.println("Calling addition" );
		overloader.test(20, 10, add);
		System.out.println("--------------------" );
		System.out.println("Calling Multiplication" );
		overloader.test(20, 10, multiply);
	}

	private void test(int a, int b, DoSomethingWithNumbers operator) {
		System.out.println("Value:" + operator.operate(a, b));
	}
}
