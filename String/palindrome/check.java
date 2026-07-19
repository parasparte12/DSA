
// this is the implementation of palindrome check
// approach : we will use two pointer approach to check if the string is palindrome or not. We will use one pointer at the start of the string and another pointer at the end of the string and we will check if the characters at both pointers are same or not. If they are same then we will move both pointers towards the center of the string and we will repeat this process until both pointers meet at the center of the string. If at any point of time the characters at both pointers are not same then we will return false because the string is not palindrome. If both pointers meet at the center of the string then we will return true because the string is palindrome.

public class check{

     public static boolean ispalindrome(String str){
    //     for(int i=0;i<str.length()/2;i++){
    //        int n=str.length();
    //        if(str.charAt(i) !=str.charAt(n-1-i)){
    //         // not a palindrome
    //         return false;

    //        }


    //     }
    //     return true;
    
        int lp=0;
        int rp=str.length()-1;

        while(lp<rp){
            if(str.charAt(lp)!=str.charAt(rp)){ // if the characters at both pointers are not same then we will return false because the string is not palindrome
                return false;
            }
            lp++;
            rp--;
        }
        return true;
     }

    public static void main(String args[]){
        String str="racecar";
        System.out.println(ispalindrome(str));
    }
}