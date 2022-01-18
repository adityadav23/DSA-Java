public class Stream{

    public static void main(String[] args){

        String x ="qweappleaartab";
        String ignore = "apple";
      String ans =  skipString(x,ignore );
      System.out.println(ans);
    }

  
    
    static String skipString( String input, String ignoreString){
        
        if(input.isEmpty()){
            return "" ;
        }
        if(input.startsWith(ignoreString)){

           return skipString( input.substring(ignoreString.length()),ignoreString);
        }
        else{
            return  input.charAt(0) + skipString( input.substring(1), ignoreString);
        }
    }

    
}