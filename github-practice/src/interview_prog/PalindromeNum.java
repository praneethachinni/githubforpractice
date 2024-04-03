package interview_prog;

public class PalindromeNum {

	public static void main(String[] args) {
		int n=12321;
		int rev=0;
		int temp=n;
		while (n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if (temp==rev) {
			System.out.println("given num is a palindrome");
		} else {
			System.out.println("given num is a not palindrome");
		}
	}

}
