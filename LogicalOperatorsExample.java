package com.destination.septemberbatch.sep25;

public class LogicalOperatorsExample {

	public static void main(String[] args) {
		int a = 10;
		int b = 100;
		int c = 1000;
		System.out.println("Logical AND Example");
		 boolean res1 = (a>5 && b<150 && c<2000);
		 System.out.println(res1);
		 res1 = (a>5 && b<150 && c<2000);
		 System.out.println("==========");
		 
		 System.out.println("Logical OR Example");
		 boolean res2 = (a>5 || b<150 || c<2000);
		 System.out.println(res2);
		 res2 = (a>5 || b<150 || c<2000);
		 System.out.println("==========");
		 
	}

}
