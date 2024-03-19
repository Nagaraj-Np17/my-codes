package March5;

public class Question3 {
    public static boolean jumbledNumberOrNOt(int num){
        if(num==0){
            return true;
        }
        while(num>0){
            int rem=num%10;
            if((rem+1==(num/10)%10 || rem-1==(num/10)%10)){
                num/=10;
                continue;
            }
            else{
                return false;
            }
        }

        return false;
}

public static void main(String[] args) {
    int num=123;
    System.out.print(jumbledNumberOrNOt(num));
}


}
