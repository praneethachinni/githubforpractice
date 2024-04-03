package interview_prog;

public class LargeWithoutSorting {

	public static void main(String[] args) {
		int arr[]= {1,9,2,8,3,7,4,6,5};
		int first = arr[0];
		int second =arr[0];
		int third = arr[0];
		for (int i = 0; i < arr.length; i++) {
			int arrvar = arr[i];
			if (first<arrvar) {
			    third = second; 
				second=first;
				first = arrvar;
			}
			else if (second < arrvar) {
					third = second;
					second =arrvar;
			}
			else if (third<arrvar) {
					    third = arrvar;
					}
				}
		
         System.out.println(third);
        // System.out.println(second);
        // System.out.println(first);
	}

}
