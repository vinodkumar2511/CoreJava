package com.destination.septemberbatch.sep25;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String str=sc.nextLine();
		String[] str2=str.split(" ");
		int count=0;
		//String s="";
		for(int i=0;i<str2.length;i++) {
			
			//s+=str2[i];
			
			count++;
		}
		System.out.println("The total number of count is "+count);
		
	}

}
