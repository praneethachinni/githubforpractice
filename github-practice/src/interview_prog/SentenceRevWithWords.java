package interview_prog;

public class SentenceRevWithWords {
	public static void main(String[] args) {
		String s1 = "Hi Welcome to TestYantra";
		String arr[] = s1.split(" ");
		String reverse = "";
		for (int i = 0; i < arr.length; i++) {
			String rev = "";
			for (int j = arr[i].length() - 1; j >= 0; j--) {

				rev = rev + arr[i].charAt(j);
			}
			reverse = reverse + rev + " ";
		}
		System.out.println(reverse);

	}
}
