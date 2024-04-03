package interview_prog;

public class CompressString {

	public static void main(String[] args) {
		String s="aaaabbbcccd";
		String res="";
		int count=1;
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i)==s.charAt(i+1)) {
				   count++;
			    }else {
			    	res=res+s.charAt(i)+count;
			    	count=1;
			    }
			}
		res=res+s.charAt(s.length()-1)+count;
		System.out.println(res);
	}

}
 