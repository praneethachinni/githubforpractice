package interview_prog;

public class FactorialWithRecursion {
	static int fact=1;
	public static int factorial(int a) {
		if(a>1) {
		fact=fact*a;
		a--;
		factorial(a);
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

}
