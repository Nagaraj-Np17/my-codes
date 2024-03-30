package interfacepackages.sort;

public class BubbleSort implements Sortable{

	@Override
	public void sort(int[] arr) {
		mergeSort(arr);
		System.out.println("BubbleSort");
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public void mergeSort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			boolean swap=false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
				}
			}
			if(!swap) {
				break;
			}
		}
			
		}
	
	

}
