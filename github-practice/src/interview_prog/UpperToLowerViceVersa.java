package interview_prog;

public class UpperToLowerViceVersa {

	public static void main(String[] args) {
		String s="AAAA bbbccDDDDDeeeeFFFFgggg";
		String result="";
		char []ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='A'&&ch[i]<='Z') {
				String res="";
				res=res+ch[i];
				res=res.toLowerCase();
				result+=res;
			}
			else {
				String res="";
				res=res+ch[i];
				res=res.toUpperCase();
				result+=res;
			}
		}
		System.out.println(result);
	}

}
