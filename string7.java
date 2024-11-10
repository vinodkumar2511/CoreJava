package com.destination.septemberbatch.sep25;

import java.util.Arrays;

public class string7 {

	public static void main(String[] args) {
		String s1 = "top";
		String s2 = "pot";
		if(s1.length()==s2.length()) {
			char arr1[] = new char[s1.length()];
			char arr2[] = new char[s2.length()];
			for(int i=0;i<arr1.length;i++) {
				arr1[i] = s1.charAt(i);
				arr2[i] = s2.charAt(i);
			}
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if(Arrays.equals(arr1,arr2)) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("not Anagram");
			}
		}
		else {
			System.out.println("not Anagram");
		}
	}

}
