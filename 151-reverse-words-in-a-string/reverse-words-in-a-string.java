class Solution {
    public String reverseWords(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<=right && s.charAt(left)==' '){
            left ++;
        }
        while(left<=right && s.charAt(right)==' '){
            right --;
        }
        Deque<String> stack = new ArrayDeque<>();
        StringBuilder word = new StringBuilder();

        while(left<=right){
            char c=s.charAt(left);
            
            if(c!=' '){
                word.append(c);
            
              }
              else if(word.length()>0){
                stack.offerFirst(word.toString());
                word.setLength(0);
              }
              left ++;
        }
        if (word.length() > 0) {
            stack.offerFirst(word.toString());
        }
        return String.join(" ", stack);
        

        }
        
    }
