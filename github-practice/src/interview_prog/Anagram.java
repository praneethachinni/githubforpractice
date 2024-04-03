package interview_prog;

import java.util.Iterator;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two string:");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if (s1.length()==s2.length()) {
			char[] ch1=s1.toCharArray();
			for (int i = 0; i < ch1.length; i++) {
				for (int j = i; j < ch1.length; j++) {
					if (ch1[i]>ch1[j]) {
						char temp=ch1[i];
						ch1[i]=ch1[j];
						ch1[j]=temp;
					}
				}
			}
			char[] ch2=s2.toCharArray();
			for (int i = 0; i < ch2.length; i++) {
				for (int j = i; j < ch2.length; j++) {
					if (ch2[i]>ch2[j]) {
						char temp=ch2[i];
						ch2[i]=ch2[j];
						ch2[j]=temp;
					}
				}
			}
			/*
			 * for (int i = 0; i < ch1.length; i++) { System.out.print(ch1[i]+" "); }
			 * 
			 * for (int i = 0; i < ch2.length; i++) { System.out.print(ch2[i]+" "); }
			 */
			boolean anagram=true;
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i]==ch2[i]) {
					anagram=true;
				} else {
					anagram=false;
					break;
				}
			}
			if (anagram==true) {
				System.out.println(s1+" and "+s2+" are anagram");
			} else {
				System.out.println(s1+" and "+s2+" are not anagram");
			}
		}
		else {
			System.out.println(s1+" and "+s2+" are not anagram");
		}
	}

}
