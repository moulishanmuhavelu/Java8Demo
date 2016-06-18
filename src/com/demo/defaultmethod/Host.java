package com.demo.defaultmethod;

public interface Host {
	default void sayHello(String str) {
		System.out.println("Hello " + str);
	}
}
