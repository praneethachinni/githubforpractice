package interview_prog;

public class ReversingArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int size=arr.length-1;
		int rev[]=new int[size+1];
		for (int i = 0; i < rev.length; i++) {
			rev[i]=arr[size];
			size--;
		}
		for (int i =rev.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}

}
