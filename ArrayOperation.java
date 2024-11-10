package com.destination.septemberbatch.sep25;

import java.util.Scanner;

class ArrayOperation {
	public static void main(String[] args) {
		Arrays a=new Arrays();
		a.createArray(4);
		a.addData();
		a.display();
	}
	
}
class Arrays{
	int arr[];
	int size;

	void createArray(int n) {
		size = n;
		arr = new int[n];
		System.out.println("Array is created");
		System.out.println("=================");

	}
	void addData() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Collecting array data:");
		for (int i=0;i<size;i++) {
			System.out.println("enter the marks of student no: "+(i+1));	 
			arr[i] = sc.nextInt();	 
		}
		System.out.println("Data added successfully");
		System.out.println("========================");
	}
	void display() {
		for (int i=0;i<size;i++) {
			System.out.println(arr[i]+" ");
		}
		
		System.out.println("========================");
	}
	
}
