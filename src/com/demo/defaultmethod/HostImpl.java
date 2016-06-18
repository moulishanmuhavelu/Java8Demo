package com.demo.defaultmethod;

public class HostImpl implements Host {

	public static void main(String[] args) {
		System.out.println("I'm from HostImpl");
		
		Host host = new HostImpl();
		host.sayHello("Mouli");
	}

}
