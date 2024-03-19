package March5;
import java.util.Arrays;
import java.util.Scanner;
public class Question5 {
    public static void largestLexigraphical(String str){
    char []res=str.toCharArray();
    for(int i=0;i<res.length;i++){
        for(int j=i+1;j<res.length;j++){
            if(res[i]<res[j]){
                char temp=res[i];
                res[i]=res[j];
                res[j]=temp;
            }
        }
        
    }

    System.out.println(Arrays.toString(res));

    }


    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String:");
    String str=sc.next();
    largestLexigraphical(str);
        
    }
}
