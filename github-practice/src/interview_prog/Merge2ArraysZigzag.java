package interview_prog;

public class Merge2ArraysZigzag {

	public static void main(String[] args) {
		int []a= {1,2,3};
		int []b= {4,5,6};
		int temp1=0;
		int temp2=0;
		int []res=new int[a.length+b.length];
		for (int i = 0; i < res.length; i++) {
			if (i%2==0) {
                res[i]=a[temp1];
                temp1++;
			}
			else {
				res[i]=b[temp2];
				temp2++;
			}
		}
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}

}
