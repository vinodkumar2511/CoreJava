package com.destination.septemberbatch.sep25;
class DemoTiger{
	String name;
	String Colour;
	String Country;
	int age;

	void setStaticName() {
		name = "ramu";
	}
	void setStaticColour() {
		Colour = "orange";
	}
	void setStaticCountry() {
		Country = "africa";
	}
	void setStaticAge() {
		age = 4;
	}
	void setDynamicName(String s1) {
		name = s1;
	}
	void setDynamicColour(String s2) {
		Colour = s2;
	}
	void setDynamicCountry(String s3) {
		Country = s3;
	}
	void setDynamicAge(int i1) {
		age = i1;
	}
	String getName() {
		return name;
	}
	String getColour() {
		return Colour;
	}
	String getCountry() {
		return Country;
	}
	int getAge() {
		return age;
	}
}
public class Tiger {

	public static void main(String[] args) {
		DemoTiger t1 = new DemoTiger();
		System.out.println(t1.getName());
		System.out.println(t1.getColour());
		System.out.println(t1.getCountry());
		System.out.println(t1.getAge());
		System.out.println("===========");
		t1.setStaticName();
		t1.setStaticColour();
		t1.setStaticCountry();
		t1.setStaticAge();
		System.out.println(t1.getName());
		System.out.println(t1.getColour());
		System.out.println(t1.getCountry());
		System.out.println(t1.getAge());
		System.out.println("===========");
		DemoTiger t2 = new DemoTiger();
		System.out.println(t2.getName());
		System.out.println(t2.getColour());
		System.out.println(t2.getCountry());
		System.out.println(t2.getAge());
		System.out.println("===========");
		t2.setDynamicName("Sham");
		t2.setDynamicColour("White");
		t2.setDynamicCountry("india");
		t2.setDynamicAge(5);
		System.out.println(t2.getName());
		System.out.println(t2.getColour());
		System.out.println(t2.getCountry());
		System.out.println(t2.getAge());

	}

}
