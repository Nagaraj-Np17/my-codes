package Combined_Assignment_1;

import java.util.Scanner;
public class Question3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of People To Check BMI:");
		int totalPeople=sc.nextInt();
		BMI calc[]=new BMI[totalPeople];
		for(int i=0;i<totalPeople;i++)
		{
			System.out.println("Enter the Person Name:");
			String name=sc.next();
			System.out.println("Enter the Person weight:");
			float wt=sc.nextFloat();
			System.out.println("Enter the Person Height:");
			float ht=sc.nextFloat();
			
			float metre=(float)(ht/100.0);
			float bmi=(float) (wt/(Math.pow(metre,2)));;
			String result;
			if(bmi<=18.5) {
				result="UnderWeight";
			}else if(bmi>18.5&& bmi<=25) {
				result="Normal";
			}else {
				result="OverWeight";
			}
			BMI check=new BMI(name,bmi,result);	
			calc[i]=check;
		}	
		for(int j=0;j<calc.length;j++) {
			for(int k=j+1;k<calc.length;k++) {
				if(calc[j].bmi<calc[k].bmi) {
					BMI temp=calc[j];
					calc[j]=calc[k];
					calc[k]=temp;
				}
			}
		}
		System.out.println("Name\t|\t BMI\t|\tRemarks\t|");
		for(int i=0;i<calc.length;i++) {
			System.out.print(calc[i].name+"\t|\t");
			System.out.printf("%,.2f",calc[i].bmi);
			System.out.print("\t|\t");
			System.out.print(calc[i].res+"\t|");
			System.out.println();
		}
		
		

	}

}
class BMI{
	String name;String res;float bmi;
	public BMI(String name,float bmi,String res){
		this.name=name;this.bmi=bmi;this.res=res;
	}
}
