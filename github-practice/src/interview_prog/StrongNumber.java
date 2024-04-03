package interview_prog;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num:");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(temp!=0) {
			int rem=temp%10;
			int fact=1;
			while(rem>0) {
				fact=fact*rem;
				rem--;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if(sum==num)
			System.out.println("strong num");
		else
			System.out.println("not strong num");
	}

}
