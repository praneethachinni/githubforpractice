package interview_prog;

import java.util.Scanner;

public class TransposeMatrix {
	public static int[][] transpose(int b[][]) {
		for (int i= 0;  i< b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				if(i>j) {
					int temp=b[i][j];
					b[i][j]=b[j][i];
					b[j][i]=temp;
				}
			}
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row and col values:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		System.out.println("enter the array elements:");
		for (int i= 0;  i< a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("array elements are:");
		for (int i= 0;  i< a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("array elements after transpose are:");
		int res[][]=transpose(a);
		for (int i= 0;  i< res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}

}
