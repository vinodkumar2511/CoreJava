package com.destination.septemberbatch.sep25;
 class cat {
	String name;
	String colour;
	String breed;
	int cost;
	int age;
	void setData(String name,String colour,String breed,int cost,int age) {
		this.name = name;
		this.colour = colour;
		this.breed = breed;
		this.cost = cost;
		this.age = age;			
	}
	void setName(String name) {
		this.name = name;
	}
	void setcolour(String colour) {
		this.colour = colour;
	}
	void setbreed(String breed) {
		this.breed = breed;
	}
	void setcost(int cost) {
		this.cost = cost;
	}
	void setage(int age) {
		this.age = age;
	}
	void getData() {
		System.out.println(name);
		System.out.println(colour);
		System.out.println(breed);
		System.out.println(cost);
		System.out.println(age);
	}
}
public class Shadowingproblem {

	public static void main(String[] args) {
	 cat c1 = new cat();
	 c1.setData("Tommy","Black","pug",5000,5);
     c1.getData();
     System.out.println("==============");
	 cat c2 = new cat();
	 c2.setName("Jimmy");
     c2.setcolour("White");
     c2.setbreed("GR");
     c2.setcost(6000);
     c2.setage(4);
     c2.getData();
     System.out.println("============");
	}
}
