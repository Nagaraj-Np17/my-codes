package Task2;

public class Duplicate {

	public static void main(String[] args) {
		int  arr[]= {1,1,3,4,2,5,3,5};
		repeatedElement(arr);
	}

	private static void repeatedElement(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int c=0;
			{
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						System.out.print(arr[i]+" ");
						break;
					}
				}
				
			}
		}
		
	}

}
