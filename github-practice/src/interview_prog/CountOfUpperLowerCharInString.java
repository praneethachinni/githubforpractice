package interview_prog;

public class CountOfUpperLowerCharInString {

	public static void main(String[] args) {
		String s="Chinni Praneetha";
		int upper=0;
		int lower=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
				upper++;
			} else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
				lower++;
			}
		}
		System.out.println("upper case count: "+upper);
		System.out.println("lower case count: "+lower);
	}

}
