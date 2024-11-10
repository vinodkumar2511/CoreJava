package com.destination.septemberbatch.sep25;

import java.util.Scanner;

class ArrayOp {
	int arr [][];
	int cls;
	Scanner sc = new Scanner (System.in);

	void creatArray(int n) {
		cls = n;
		arr = new int[n][];
		System.out.println("Collecting student count for each class: ");
		for (int i=0;i<arr.length;i++) {
			System.out.println("Enter the student count inside thr class no: "+(i+1));
			int stu = sc.nextInt();
			arr[i] = new int[stu];
		}
		System.out.println("Array is created successfully");
		System.out.println("===========================");
	}
	void addData() {
		System.out.println("Collecting array data: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the marks of student no: "+(j+1));
				arr[i][j] = sc.nextInt();
			}
		}
	}
	void display() {
		System.out.println("Display array Data");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class no : "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("The marks of student no: "+(j+1)+" is = "+arr[i][j]);
			}
		}
	}
}
public class ArrayOperators3 {

	public static void main(String[] args) {
		ArrayOp ao2 = new ArrayOp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the class count");
		int cls = sc.nextInt();
		ao2.creatArray(cls);
		ao2.addData();
		ao2.display();
		sc.close();

	}

}
