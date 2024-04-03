package interview_prog;

public class RemoveDupStr {

	public static void main(String[] args) {
		String s1="My name is Khan";
		String []str=s1.split(" ");
		String s2="";
		for (int i = 0; i < str.length; i++) {
			String x=str[i];
			for(int j=0;j<x.length();j++) {
				char ch=' ';
				if(x.charAt(j)>='A' && x.charAt(j)<='Z') {
			         ch=(char) (x.charAt(j)+32);
			         if (s2.indexOf(ch)==-1) {
			        	ch=(char) (ch-32);   
							s2+=ch;
			         }
				}
				else {
					 ch=x.charAt(j);
					 if (s2.indexOf(ch)==-1) {
							s2+=ch;
						    }
				}
			}
            s2=s2+" ";
		}
		System.out.println(s2);
	}

}

