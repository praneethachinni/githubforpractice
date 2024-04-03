package interview_prog;

public class RemoveNumbersFromString {

	public static void main(String[] args) {
		String s="chinni08 pra16nee22tha";
		String s2="";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>=48 && s.charAt(i)<=57) {
				s2=s2;
			}
			else {
				s2=s2+s.charAt(i);
			}
		}
		System.out.println(s2);
	}

}
