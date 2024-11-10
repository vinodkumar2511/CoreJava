package com.destination.septemberbatch.sep25;

import java.util.Scanner;

class ArrayOperators {
	int arr[][];
	int cls;
	int stu;

	void createArray(int n,int m) {
		cls = n;
		stu = m;
		arr = new int[n][m];
		System.out.println("Array is created successfully");
		System.out.println("=============================");

	}
	void addData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("collecting array data");
		for(int i=0;i<cls;i++) {
			System.out.println("Inside class no: "+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("enter the marks of student no: "+(j+1));
				arr[i][j] = sc.nextInt();
			}	
		}
		System.out.println("marks successfully collected");
		System.out.println("============================");
	}
	void display() {
		System.out.println("Diaplay array data");
		for(int i=0;i<cls;i++) {
			System.out.println("Inside class no: "+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("enter the marks of student no: "+(j+1));

			}
		}
	}

}

public class ArrayOperators2 {

	public static void main(String[] args) {
		ArrayOperators ao1 = new ArrayOperators();
		ao1.createArray(2, 2);
		ao1.addData();
		ao1.display();
	}
}
