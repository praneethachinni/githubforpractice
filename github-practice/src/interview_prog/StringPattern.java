package interview_prog;

public class StringPattern {

	public static void main(String[] args) {
     	String s="sum";
		
//		for (int i = 0; i < s.length(); i++) {
//			for (int j = i+1; j < s.length(); j++) {
//				System.out.print(s.charAt(i));
//			}
//			System.out.println();
//		}
		
		int n=s.length();
		for (int k = 0; k < n; k++) {
			//int a=k;
			for (int i = k; i < n; i++) {
				int a=k;
				for (int j = k; j < n; j++) {
					if(i>=j) {
					System.out.print(s.charAt(a)+" ");
					a++;
					}
					else
						System.out.print("  ");
				}
				System.out.println();
			}

		}
	}

}
