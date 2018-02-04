package com.madhav;

public final class A {
	static A obj = new A();
	private A() {
		System.out.println("constructor!!!");
	}
	public static A getInstance() {
		return obj;
	}
}
