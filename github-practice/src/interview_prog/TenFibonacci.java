package interview_prog;

public class TenFibonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int sum=0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		/*int n=3;
		while(n<8) {
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
			n++;
		}*/
		for (int i = 2; i <= 9; i++) {
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}
	}

}
