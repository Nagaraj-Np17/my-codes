package Exericsm;

public class SqueakyClean {
	   
    static String clean(String identifier) {
     StringBuilder sb=new StringBuilder();
      
    for(int i=0;i<identifier.length();i++){
        if(identifier.charAt(i)==' '){
            sb.append("_");
        }
    else if( identifier.charAt(i)=='-' ){
        i++;
        sb.append(Character.toUpperCase(identifier.charAt(i)));
    }
    else if(Character.isDigit(identifier.charAt(i))){
        if(identifier.charAt(i)=='3'){
            sb.append('e');
        } else if(identifier.charAt(i)=='0'){
            sb.append('o');
        }else if(identifier.charAt(i)=='1'){
            sb.append('l');
        }else if(identifier.charAt(i)=='7'){
            sb.append('t');
        }else if(identifier.charAt(i)=='4'){
            sb.append('a');
        }
        
    }
    else if(!Character.isLetter(identifier.charAt(i))){
             continue;
        }         
                
        else{
            sb.append(identifier.charAt(i));
        }
    }





        
        return sb.toString();
    }
}

