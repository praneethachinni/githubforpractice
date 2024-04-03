package interview_prog;

import java.util.Scanner;

public class ArnstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
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
			System.out.println("armstrong num");
		else
			System.out.println("not an armstrong number");
	}

}
