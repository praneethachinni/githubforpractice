package interview_prog;

import java.util.Scanner;

public class SumPrimeGivenRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range: ");
		int range=sc.nextInt();
		int a=2;
		int sum=0;
		while(a<range) {
		boolean flag=true;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
	    	  sum+=a;
	    	  a++;
		}
		else {
			a++;
		}
	}
		System.out.println(sum);
	}

}
