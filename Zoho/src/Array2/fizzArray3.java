package Array2;

public class fizzArray3 {
	public int[] fizzArray3(int start, int end) {
		 int array[]=new int[end-start]; 
		  for(int i=0;i<array.length;i++){
		    array[i]=start++;
		  }
		  return array;
		}

}
