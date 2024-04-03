package interview_prog;

public class ExtractDigitsInString {

	public static void main(String[] args) {
		String s="abc123d4";
	 	for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>=48 && s.charAt(i)<=57) {
				System.out.println(s.charAt(i)-48);
			}
	 	}
	}
}
