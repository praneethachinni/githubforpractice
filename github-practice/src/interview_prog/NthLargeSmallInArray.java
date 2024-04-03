package interview_prog;

import java.util.Scanner;

public class NthLargeSmallInArray {

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
		System.out.println("enter the largest value of Nth:");
        int large=sc.nextInt();
        System.out.println("enter the smallest value of Nth:");
        int small=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp =arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
        System.out.println(arr[arr.length-(large)]);
        System.out.println(arr[small-1]);
	}

}
