package Array2;

public class fizzBuzz {
	public String[] fizzBuzz(int start, int end) {
		  String  res[]=new String[end-start];
		  for(int i=0;i<res.length;i++){
		    if((start%3==0)&&(start%5==0)){
		      res[i]="FizzBuzz"; 
		    }else if(start%3==0){
		      res[i]="Fizz";
		    }else if(start%5==0){
		      res[i]="Buzz";}
		      else{
		        res[i]=String.valueOf(start);
		      }
		    start++;
		    
		  }
		  return res;
		}

}
