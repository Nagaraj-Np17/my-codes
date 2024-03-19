package AP_1;

public class MergeTwo {

	public String[] mergeTwo(String[] a, String[] b, int n) {
		int index=0;String []merge=new String[n];int r=0;int  l=0;
		char left=0;char right=0;char last=' ';
			while(index<n){
				   if(a[l].charAt(0)==b[r].charAt(0)){
				      if(last!=a[l].charAt(0)){
				         merge[index++]=a[l];
				         last=a[l].charAt(0);
				      }
				      l++;r++;
				    }else if(a[l].charAt(0)<b[r].charAt(0)){
				      if(last!=a[l].charAt(0)){
				         merge[index++]=a[l];
				         last=a[l].charAt(0);
					      }
					      l++;
				    }else  if(a[l].charAt(0)>b[r].charAt(0)){
				      if(last!=b[r].charAt(0)){
				         merge[index++]=b[r];
				         last=b[r].charAt(0);
				      }
				      r++;
			    }
			}
		return merge;
		}
	}


