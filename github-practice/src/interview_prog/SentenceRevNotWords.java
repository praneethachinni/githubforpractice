package interview_prog;

public class SentenceRevNotWords {

	public static void main(String[] args) {
		String s1="java is a programming language";
		String arr[]=s1.split(" ");
		String rev = "";
		for (int i =arr.length-1; i >=0; i--) {
			rev=rev+arr[i]+" ";
		}
		System.out.println(rev);
	}

}
