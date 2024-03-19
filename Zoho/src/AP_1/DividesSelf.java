package AP_1;

public class DividesSelf {
	public boolean dividesSelf(int n) {
		  int temp=n;
		  while(n>0){
		    int  rem=n%10;
		    if(rem==0)return false;
		    if(temp%rem!=0){
		      return false;
		    }
		    n/=10;
		  }
		  
		  
		  return true;
		}

}
