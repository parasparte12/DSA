class Solution {
    List <String> list=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        
        backtrack("", 0, 0, n);

        return list;
    }
         void backtrack(String s, int open, int closed, int n){

            if (open ==n && closed== n ){
                list. add(s);
                return ;
            }
            if (open<n ){
                backtrack(s +'(', open +1, closed, n);
            }
            if (closed<open ){
                backtrack(s +')', open, closed+1, n);

                
            }
        }
        
    }