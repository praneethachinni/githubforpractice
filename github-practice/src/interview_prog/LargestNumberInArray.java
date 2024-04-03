package interview_prog;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int arr[]= {3,21,16,8,29,22,14};
		int large=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (large<arr[i]) {
				large=arr[i];
			}
		}
		System.out.println(large);
	}

}
