package com.exam;

class Parent{
	void printParent() {
	System.out.println("printParent()");
		
	}
}

class Child extends Parent { // »ó¼Ó
	void printChild() {
		System.out.println("printChild()");
	}
}

class Child2 extends Parent{
	void printChild2() {
		System.out.println("PrintChild2()");
	}
}
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=3;//int -> double 
		System.out.println(d);
		
		int a=(int)3.14;
		System.out.println(a);//3
		
		Child c=new Child();
		c.printParent();
		c.printChild();
		
		System.out.println("=======================");
		
		Parent p;
		p=new Child();
		p.printParent();
		
		System.out.println("=======================");
		
		c=(Child)new Parent();
		c.printParent();
		c.printChild();
		
	}

}

