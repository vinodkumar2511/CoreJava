package com.destination.septemberbatch.sep25;

public class ConditionOperatorsExample {

	public static void main(String[] args) {
		System.out.println("===ConditionOperators===");
		int a = 100;
		int b = 50;
		
		System.out.println("value no:1 = +a");
		System.out.println("value no:2 = +b");
		System.out.println("===============");
		
		boolean res1 = a>b;
		System.out.println("Greater than result :"+res1);
		System.out.println("===============");
		
		boolean res2 = a<b;
		System.out.println("less than result :"+res2);
		System.out.println("===============");
		
		boolean res3 = a>=b;
		System.out.println("Greater than or equal to result :"+res3);
		System.out.println("===============");
		
		boolean res4 = a<=b;
		System.out.println("less than or equal to result :"+res4);
		System.out.println("===============");
		
		boolean res5 = a==b;
		System.out.println("equals to result :"+res5);
		System.out.println("===============");
		
		boolean res6 = a!=b;
		System.out.println("Not equals to result :"+res6);
		System.out.println("===============");
					
	}

}
