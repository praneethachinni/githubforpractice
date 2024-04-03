package interview_prog;

public class Prime10thNumber {

	public static void main(String[] args) {
		int n=10;
		int a=1;
		int count=0;
		while(a<50) {
		boolean flag=true;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
	    	  count++;
	    	  if (count==n) {
				System.out.println(a);
				break;
			}
	    	  a++;
		}
		else {
			a++;
		}
	}
	}

}
