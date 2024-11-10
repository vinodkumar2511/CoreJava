package com.destination.septemberbatch.sep25;
class ArithemticOperators {
	void add(int a,int b) {
		int res1 = a+b;
		System.out.println("Addition result is :"+(res1));
		System.out.println("====================");
	}
	void sub(int a,int b) {
		int res2 = a-b;
		System.out.println("Subtraction result is :"+(res2));
		System.out.println("====================");
	}
	void mul(int a,int b) {
		int res3 = a*b;
		System.out.println("Multiplication result is :"+(res3));
		System.out.println("====================");
	}
	void div(int a,int b) {
		int res4 = a/b;
		System.out.println("Division result is :"+(res4));
		System.out.println("====================");
	}
	void mod(int a,int b) {
		int res5 = a%b;
		System.out.println("Modulus result is :"+(res5));
		System.out.println("====================");
	}
}
public class ArithmeticOperatorsExample {

	public static void main(String[] args) {
		System.out.println("===ArithmeticOperators===");
		int a =100;
		int b = 50;
		ArithemticOperators ao = new ArithemticOperators();
		ao.add(a,b);
		ao.sub(a,b);
		ao.mul(a,b);
        ao.div(a,b);
        ao.mod(a,b);
	}

}
