package interview_prog;

public class SecondLargeInArray {

	public static void main(String[] args) {
		int arr[] = {1,5,6,7,8,9,12};
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp =arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[arr.length-2]);

	}

}
