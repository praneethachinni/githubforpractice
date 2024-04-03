package interview_prog;

public class ToAddNumbersInString {

	public static void main(String[] args) {
	 	String s="abc123d4";
	 	int sum=0;
	 	for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>=48 && s.charAt(i)<=57) {
				sum+=s.charAt(i)-48;
			}
		}
	 	System.out.println(sum);
	}

}
