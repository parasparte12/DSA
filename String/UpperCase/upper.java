public class upper{

    public static String toUpperCase(String str){

        StringBuilder sb=new StringBuilder("");

        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){ // this loop will iterate through the string starting from the second character
            if(str.charAt(i)==' ' && i<str.length()-1){ // this condition will check if the current character is a space and if it is not the last character of the string
              sb.append(str.charAt(i));// this will append the space to the StringBuilder
              i++;  
              sb.append(Character.toUpperCase(str.charAt(i))); // this will convert the first character of the next word to uppercase

            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main (String args[]){

        String str="hi my name is paras";
        System.out.println(toUpperCase(str));
    }
}