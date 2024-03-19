package Combined_Assignment_1;
import java.util.Arrays;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Total Number of Members:");
	int total=sc.nextInt();
	float WeightList[]=new float[total];
	for(int i=0;i<total;i++) {
		System.out.println("Enter the +"+(i+1)+" st Person weigth:");
		WeightList[i]=sc.nextInt();
	}
	float averageWeight=(calcAverage(WeightList,total));
	System.out.println("Average Weight Of Member: "+averageWeight);
	}

	public static float calcAverage(float[] WeightList,int total) {
		if(WeightList.length==0) {
			return 0;
		}
		float sumOfWeight=0;
		for(float i:WeightList) {
			sumOfWeight+=i;
		}
		return ((sumOfWeight)/total);
		
	}

}
