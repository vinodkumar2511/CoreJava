package com.destination.septemberbatch.sep25;
class Cal{
	int add(int a,int b) {
		return a+b;
	}
	float add(int a,float b) {
		return a+b;
	}
	float add(float a,int b) {
		return a+b;
	}
	float add(float a,float b) {
		return a+b;
	}
	double add(double a,int b) {
		return a+b;
	}
	double add(int a,double b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	double add(double a,float b,int c) {
		return a+b+c;
	}
	double add(float a,double b,int c) {
		return a+b+c;
	}
	double add(int a,float b,double c) {
		return a+b+c;
	}
}
public class Calculator {

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.add(10,20));
		System.out.println(c.add(90.87f,20));
		System.out.println(c.add(40,50.74f));
		System.out.println(c.add(10,20,26.67f));
	}
}
