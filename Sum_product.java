package com.destination.septemberbatch.sep25;

import java.util.Scanner;

public class Sum_product {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String s1=sc.nextLine();
		System.out.println("Enter String 2 : ");
		String s2=sc.nextLine();
		
		int num1=Integer.parseInt(s1);
		int num2=Integer.parseInt(s2);
		Sum_product s=new Sum_product();
		int sumResult=s.sum(num1, num2);
		double productResult=s.product(num1, num2);
		System.out.println("Sum :"+sumResult);
		System.out.println("Product :"+productResult);
		
	}
	
	public  int sum(int num1,int num2) {
		return num1+num2;
	}
	
	public  double product(int num1,int num2) {
		return num1*num2;
	}

}
