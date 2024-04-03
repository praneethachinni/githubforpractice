package interview_prog;

public class SwapStringsWithoutTemp {

	public static void main(String[] args) {
		String s1="chinni";
		String s2="praneetha";
		int s1_size=s1.length();
		int s2_size=s2.length();
	    s1=s1+s2;
	    s2=s1;
	    s1=s1.substring(s1_size);
	    s2=s2.substring(0,s1_size);
		System.out.println(s1);
		System.out.println(s2);
	}

}
