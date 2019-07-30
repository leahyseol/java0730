package com.exam;

class Animal { // ����
	void speak() {
		System.out.println("�Ҹ�����~~");
	}
}

class Dog extends Animal {
	@Override // �ֳ����̼�(annotation)
	void speak() {
		System.out.println("�۸�~~~!");
	}
}

class Cat extends Animal {
	@Override
	void speak() {
		System.out.println("�߿�~~!");
	}
}

class Vet { // ���ǻ�
	void giveShot(Cat cat) { // �ֻ���� �޼ҵ�
		cat.speak(); // �ֻ�¾Ƽ� �ƾ�!!
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
