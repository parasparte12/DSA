class Solution {

    private boolean allZero(int count[]){
        for(int x:count){
            if(x!=0) return false;
       
        }
         return true;
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();    
        int a=s.length();
        int b=p.length();
        if(b>a) return res;
        int count[]=new int[26];
        for(char c:p.toCharArray()){
            count[c-'a']++;

        }
        int i=0;// window start
        for(int j=0;j<a;j++){
            count[s.charAt(j)-'a']--;//enter
            if(j-i+1==b){
                if(allZero(count)) res.add(i);
                count[s.charAt(i)-'a']++;//exit
                i++;
            }

        }
        return res;


    }
}