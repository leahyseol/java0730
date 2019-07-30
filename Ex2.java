package com.exam;

//super.this.

class Employee {
	String name;
	int salary;

	Employee() {
	}

	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	String getEmployee() {
		return name + "," + salary;
	}

} // class Employee

class Manager extends Employee {
	String depart;

	Manager(String name, int salary, String depart) {
		this.name = name;
		this.salary = salary;
		this.depart = depart;
	}

	String getManager() {
		// return name+"," + salary+ "," + depart;
		return getEmployee() + "," + depart;
	}
}

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee("Jessica",10000);
		System.out.println(emp.getEmployee());
		
		Manager man=new Manager("John",20000,"accounting");
		System.out.println(man.getEmployee());
		System.out.println(man.getManager());
	}

}
