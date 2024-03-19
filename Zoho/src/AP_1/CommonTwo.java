package AP_1;

public class CommonTwo {
	public int commonTwo(String[] a, String[] b) {
		  
		  int num=0;int  i=0,j=0;
		  char  last=' ';
		  while(i<a.length &&  j<b.length){
		    if(a[i].equals(b[j]))
		    {
		      if(last!=a[i].charAt(0))
		      {
		        num++;
		        last=a[i].charAt(0);
		      }
		      i++;j++;
		    }
		    else if(a[i].charAt(0)<b[j].charAt(0))
		    {
		      i++;
		    }
		    else if(a[i].charAt(0)>b[j].charAt(0))
		    {
		      j++;
		    }
		  }
		  return num;
		  
		  
		}

}
