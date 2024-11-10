package com.destination.septemberbatch.sep25;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String str=sc.nextLine();
		String[] s=str.split(" ");

		for(int i=0;i<s.length;i++) {
			String s2=reverse(s[i]);
			System.out.print(s2+" ");
		}
		sc.close();
	}
	public static String reverse(String str) {
		String s="";
		for(int i=str.length()-1;i>=0;i--) {
			s+=str.charAt(i);
		}
		return s;
	}
	

}
