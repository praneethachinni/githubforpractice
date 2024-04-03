package interview_prog;

public class SumOfNaturalNumbersRecursion {
	static int sum=0;
	public static int add(int a) {
		if(a>0) {
			sum=sum+a;
			a--;
			add(a);
			}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(add(100));
	}

}
