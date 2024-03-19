package AP_1;

public class SumHeights {
	public int sumHeights(int[] heights, int start, int end) {
		  int max=0;
		  for(int i=start;i<end;i++){
		    max+=Math.abs(heights[i]-heights[i+1]);
		    }
		    return max;
		}

}
