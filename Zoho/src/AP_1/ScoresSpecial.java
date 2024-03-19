package AP_1;

public class ScoresSpecial {
	public int scoresSpecial(int[] a, int[] b) {
		return largestSpecial(a)+largestSpecial(b);
		}
		int  largestSpecial(int []arr){
		  int  max=0;
		  for(int i=0;i<arr.length;i++){
		    if(arr[i]%10==0){
		      max=Math.max(max,arr[i]);
		    }
		  }
		  return max;
		}
}
