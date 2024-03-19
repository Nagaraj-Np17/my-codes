package AP_1;

public class ScoresAverage {

	public static void main(String[] args) {
	int []arr= {4,4,4,2,2,2};
	System.out.println((scoresAverage(arr)));
	}
		public static int scoresAverage(int[] scores) {
			  int start=0;int end=scores.length;
			  int first=average(scores,start,(end/2));
			  int second=average(scores,(end/2),end);
			  return (first>second)?first:second;
			  
			}
		static int  average(int[] scores, int start, int end){
			  int ave=0;int  c=0;
			    for(int  i=start;i<end;i++){
			      ave+=scores[i];
			      c++;
			    }
			    //System.out.println("ave"+ave/c);
			    return ave/c;
			}

	}


