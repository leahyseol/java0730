package com.exam;

class A extends Object {
	A() {
		System.out.println("������A");
	}
}
class B extends A {
	B() {
		System.out.println("������B");
	}
}
class C extends B {
	C() {
		super();
		System.out.println("������C");
	}
	C(int num){
		this();
	}
}

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();

	}

}
