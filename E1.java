package com.destination.septemberbatch.sep25;

import java.util.Scanner;

class Dog{
	String name;
	String colour;
	String breed;
	int cost;
	int age;

	void setDataStatic() {
		name = "Tommy";
		colour = "red";
		breed = "pug";
		cost = 5000;
		age = 3;
	}

	void getData() {
		System.out.println(name);		System.out.println(colour);
		System.out.println(breed);
		System.out.println(cost);
		System.out.println(age);
	}
	public void setDataDynamic(String s1,String s2,String s3,int i1,int i2) {
		name = s1;
		colour = s2;
		breed = s3;
		cost = i1;
		age = i2;
	}
}
public class E1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dog e= new Dog();
		e.getData();
		e.setDataStatic();
		System.out.println("----------");
		e.getData();
		System.out.println("----------");
		System.out.println("Enter name of dog: ");
		String name = sc.next();
		System.out.println("Enter colour of dog: ");
		String colour = sc.next();
		System.out.println("Enter breed of dog: ");
		String breed = sc.next();
		System.out.println("Enter cost of dog: ");
		int i1 = sc.nextInt();
		System.out.println("Enter age of dog: ");
		int i2 = sc.nextInt();
		
		e.setDataDynamic(name, colour, breed, i1, i2);
		e.getData();
		sc.close();
	}

}
