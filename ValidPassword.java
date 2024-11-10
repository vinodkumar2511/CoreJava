package com.destination.septemberbatch.sep25;

import java.util.Scanner;

public class ValidPassword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Valid Password : ");
		String str=sc.next();
		int cc=0;
		int sac=0;
		int dc=0;
		int special=0;
		if(str.length()==10) {
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)>=65 || str.charAt(i)<=90 ) {
					cc++;
				}
				else if(str.charAt(i)>=97 || str.charAt(i)<=122) {
					sac++;
				}
				else if(str.charAt(i)>=48 || str.charAt(i)<=57) {
					dc++;
				}
				else if(str.charAt(i)=='@' ||str.charAt(i)=='#' ||str.charAt(i)=='$' ||str.charAt(i)=='%' ||str.charAt(i)=='!') {
					special++;
				}
			}
		}


		if(cc>=1 || sac>=1 || dc>=1 || special>=1) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password");
		}

	}

}
