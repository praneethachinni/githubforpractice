package interview_prog;

public class Merge2Arrays {

	public static void main(String[] args) {
		int []a= {1,2,3,4};
		int []b= {3,4,5,6,7};
		int []res=new int[a.length+b.length];
		for (int i = 0; i < res.length; i++) {
			if (i<a.length) {
				res[i]=a[i];
			}else {
				res[i]=b[i-a.length];
			}
		}
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}

	}

}
