package interview_prog;

public class PalindromeString {

	public static void main(String[] args) {
		String s1="abc";
		String rev="";
		
		char []ch=s1.toCharArray();
		for (int i = ch.length-1; i>=0; i--) {
			rev+=ch[i];
		}
		if (s1.equals(rev)) {
			System.out.println("palindrome string");
		}
		else {
			System.out.println("not a palindrome string");
		}
	}

}
