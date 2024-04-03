package interview_prog;

public class TestArithematicException {

	public static void main(String[] args) {
		try {
        int res=10/0;
		System.out.println("result is "+res);
		}
		catch(ArithmeticException ae) {
			System.out.println("arithematic exception handled");
		}
		finally {
			 System.out.println("finally block executed");
		}
	}

}
