package com.destination.septemberbatch.sep25;

import java.util.Scanner;
/* 1
 * 1  2
 * 1  2  3
 * 1  2  3  4
 * 1  2  3  4  5
 */
public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the value of n");
	     int n=sc.nextInt();
	     for (int i=1;i<=n;i++)
	     {
	    	 for (int j=1;j<=i;j++)
	    	 {
	    	 System.out.print(j);
	    	 System.out.print("  ");
	    	 }
	    	 System.out.println();
	     }


	}

}
