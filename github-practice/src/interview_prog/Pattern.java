package interview_prog;

public class Pattern {

	public static void main(String[] args) {
		int n=5;
		for (int i = 0; i < n; i++) {
			if (i==0 ||i==n-1) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
	}

}
