package interview_prog;

import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int size=sc.nextInt();
		System.out.println("enter "+size+" elements of an array:");
		int arr[]=new int[size];
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the value to search:");
		int value=sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if(value==arr[i]) {
				System.out.println("the "+value+" is present in array");
				count++;
				break;
			}
		}
		if(count==0)
		System.out.println("the "+value+" is not present in array");
	}

}
