
public class compress{

    public static String compress(String str){
        String newstr="";
        for(int i=0;i<str.length();i++){ // this loop will run until the length of the string
            Integer count=1;// this variable will count the number of times a character is repeated
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){// this loop will run until the character is repeated
                count++;
                i++;
                     
            }
            newstr+=str.charAt(i);// this will add the character to the new string

            if(count>1){ // this will check if the character is repeated
                newstr+=count.toString();// this will add the count to the new string
            }
        }

        return newstr;
    

    }

    public static void main(String args[]){
        String str="aaabbbccdddeee";
        System.out.println(compress(str));
        
    }
}