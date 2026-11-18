class Solution {
    public int minChanges(String s) {
        int cnt=0;
        int a=s.length();
        if(s==null || a%2!=0) return 0;
        for(int i=0;i<a;i+=2){
            if(s.charAt(i)!=s.charAt(i+1)) cnt++;
        }
        return cnt;
    }
}