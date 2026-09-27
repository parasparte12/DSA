class Solution {
    public int maxNumberOfBalloons(String text) {
       int count[]=new int[26];
       for(char c : text.toCharArray()){
            count[c -'a']++;
           

       }
       int b=count['b'-'a'];
       int a=count['a'-'a'];
       int l=count['l'-'a']/2;
       int o=count['o'-'a']/2;
       int n=count['n'-'a'];
        int[] required = {b, a, l, o, n};
        int minBalloons = required[0]; // Start by assuming 'b' is the smallest

        for (int count1: required) {
        if (count1 < minBalloons) {
         minBalloons = count1; // Update if a smaller count is found
        }
}

return minBalloons;        
    }
}