package com.destination.septemberbatch.sep25;

import java.util.Scanner;

public class ReplaceVowlesWithSpecialCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String str=sc.nextLine();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a') {
				str=str.replace('a', '@');
			}
			else if(str.charAt(i)=='e') {
				str=str.replace('e', '#');
			}
			else if(str.charAt(i)=='i') {
				str=str.replace('i', '$');
			}
			else if(str.charAt(i)=='o') {
				str=str.replace('o', '*');
			}
			else if(str.charAt(i)=='u') {
				str=str.replace('u', '&');
			}
		}
		System.out.println(str);
	}

}
