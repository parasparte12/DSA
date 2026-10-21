class Solution {
    public int minOperations(String s) {
        int n=s.length();
        boolean sorted=true;
        for(int i=1;i<n;i++){
            if(s.charAt(i)<s.charAt(i-1)){
                sorted=false;break;
            }
        }
        if(sorted) return 0;
        if(n==2) return -1;  
        char minChar='z',maxChar='a';
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch<minChar) minChar=ch;
            if(ch>maxChar) maxChar=ch;
        }
        char first=s.charAt(0);
        char last=s.charAt(n-1);
        if(first==minChar || last==maxChar) return 1;
        char minMid='z',maxMid='a';
        for(int i=1;i<n-1;i++){
            char ch=s.charAt(i);
            if(ch<minMid) minMid=ch;
            if(ch>maxMid) maxMid=ch;
        }
        if(first>maxMid && last<minMid) return 3;
        return 2;
    }
}