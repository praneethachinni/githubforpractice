package interview_prog;

import java.util.Scanner;

public class ArmstrongNumbersInGivenRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range:");
		int range=sc.nextInt();
		int a=1;
		while(a<=range) {
		int num=a;
		int temp=num;
		int count=0;
		while(temp!=0) {
			count++;
			temp=temp/10;
		}
		int temp1=num;
		int arm=0;
		while (temp1!=0) {
			int rem=temp1%10;
			int pow=1;
			for (int i=0;i<count;i++) {
				pow=pow*rem;
			}
			arm=arm+pow;
			temp1=temp1/10;
		}
		if(arm==num)
			System.out.println(a+" is a armstrong num");
		a++;
	}
	}

}
