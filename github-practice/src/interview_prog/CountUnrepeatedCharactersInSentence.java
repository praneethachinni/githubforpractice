package interview_prog;

public class CountUnrepeatedCharactersInSentence {

	public static void main(String[] args) {
		String s1 = "Hi Welcome to TestYantra";
		int count=0;
		String s2="";
		for (int i=s1.length()-1; i >=0; i--) {
			if (s2.indexOf(s1.charAt(i))==-1) {
				s2+=s1.charAt(i);
				count++;
			}
//			else {
//				count++;
			//}
		}
		System.out.println(count);
	}

}
