package com.exam;

class Animal { // 동물
	void speak() {
		System.out.println("소리내기~~");
	}
}

class Dog extends Animal {
	@Override // 애노테이션(annotation)
	void speak() {
		System.out.println("멍멍~~~!");
	}
}

class Cat extends Animal {
	@Override
	void speak() {
		System.out.println("야옹~~!");
	}
}

class Vet { // 수의사
	void giveShot(Cat cat) { // 주사놓기 메소드
		cat.speak(); // 주사맞아서 아야!!
	}
}

public class Ex7 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.speak();

		animal = new Dog();
		animal.speak();

		animal = new Cat();
		animal.speak();

		System.out.println("========");

		Vet vet = new Vet();
		vet.giveShot(new Dog());
		vet.giveShot(new Cat());

	}//main method

}
