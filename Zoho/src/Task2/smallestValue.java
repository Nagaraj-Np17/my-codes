package Task2;

public class smallestValue {

	public static void main(String[] args) {
		int arr[]= {2,4,6,2,-2};
		int min=smallElement(arr);
		System.out.print(min);
	}

	private static int smallElement(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}

}
