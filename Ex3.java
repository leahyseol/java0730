package com.exam;


//method overriding

class Wolf{
	void speak() {
		System.out.println("Arf!");
	}
}

class puppy extends Wolf{
	void speak() {
		System.out.println("Yawp");
		
		void sound() {
			
		//speak(); //this.speak();
		super.speak();
	}
}
	
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy puppy=new Puppy();
		puppy.speak();
	}

}
