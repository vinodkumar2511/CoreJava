package com.destination.septemberbatch.sep25;
class Dogs //extends object
{
 String name;
 String colour;
 String breed;
 int cost;
 int age;
 //zero parameterized
 public Dogs() {
	 super();//by default
	 System.out.println("Hi From zero constructor");
 }
 //single parameterized constructor
 public Dogs(String name) {
	 this("Dacchu","Brown");
	 System.out.println("Inside single parameterized constructor");
	 this.name = name;
 }
 //2 parameterized constructor
 public Dogs(String name, String colour) {
	this("Farro","Yellow","pug");
	System.out.println("Inside 2-parameterized constructor");
	this.name = name;
	this.colour = colour;
}
 //3 parameterized constructor
 public Dogs(String name, String colour, String breed) {
	this("Hima","Blue","GR",5000);
	System.out.println("Inside 3-parameterized constructor");
	this.name = name;
	this.colour = colour;
	this.breed = breed;
}
 //4 parameterized constructor
 public Dogs(String name, String colour, String breed, int cost) {
	this("Rocky","Black","Gr-Imported",19000,5);
	System.out.println("Inside 4-parameterized constructor");
	this.name = name;
	this.colour = colour;
	this.breed = breed;
	this.cost = cost;
}
 //5 parameterized constructor
 public Dogs(String name, String colour, String breed, int cost, int age) {
	 super();
	 this.name = name;
	 this.colour = colour;
	 this.breed = breed;
	 this.cost = cost;
	 this.age =age;
 }
 public String getName() {
	 return name;
 }
 public String getcolour() {
	 return colour;
 }
 public String getbreed() {
	 return breed;
 }
 public int getcost() {
	 return cost;
 }
 public int getage() {
	 return age;
 }
 
}

public class LaunchConstructors {

	public static void main(String[] args) {
		Dogs d1 = new Dogs();
		System.out.println(d1.getName());
		System.out.println(d1.getcolour());
		System.out.println(d1.getbreed());
		System.out.println(d1.getcost());
		System.out.println(d1.getage());
		System.out.println("============");
		
	    Dogs d2 = new Dogs("a","b","c",5000,5);
	    System.out.println(d2.getName());
	    System.out.println(d2.getcolour());
	    System.out.println(d2.getbreed());
	    System.out.println(d2.getcost());
	    System.out.println(d2.getage());
	    System.out.println("==============");
	    
	    Dogs d3 = new Dogs("Ramu");
	    System.out.println(d3.getName());
		System.out.println(d3.getcolour());
		System.out.println(d3.getbreed());
		System.out.println(d3.getcost());
		System.out.println(d3.getage());
		System.out.println("============"); 

	}

}
