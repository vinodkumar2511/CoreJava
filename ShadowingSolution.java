package com.destination.septemberbatch.sep25;
class Dog1{
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
	void getData(){
		System.out.println("Name :"+name);
		System.out.println("Colour: "+colour);
		System.out.println("Breed :"+breed);
		System.out.println("Cost :"+cost);
		System.out.println("Age :"+age);
	}
	public String getName() {
		return name;	
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getcolour() {
		return colour;
	}
	public void setcolour(String colour) {
		this.colour = colour;
	}
	public String getbreed() {
		return breed;
	}
	public void setbreed(String breed) {
	    this.breed = breed;
	}
	public void setcost(int cost) {
		this.cost=cost;
	}
	public int getcost() {
		return cost;
	}
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
}
public class ShadowingSolution {

	public static void main(String[] args) {
		Dog1 d=new Dog1();
		d.setName("Jimmy");
		d.setcolour("Pink");
		d.setbreed("Pug");
		d.setage(5);
		d.setcost(9999);
		System.out.println("Name:" +d.getName());
		System.out.println("colour:"+d.getcolour());
		System.out.println("Age :"+d.getage());
		System.out.println("cost :"+d.getcost());
		System.out.println("Breed :"+d.getbreed());
		System.out.println("=================================");
		d.setData("Snoopy", "White", "GR", 7999, 9);
		d.getData();	

	}

}
