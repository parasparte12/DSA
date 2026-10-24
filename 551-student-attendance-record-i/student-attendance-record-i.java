class Solution {
    public boolean checkRecord(String s) {
        int ab=0;
        int lat=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='A'){
                ab++;
                lat=0;
                if(ab>=2) {
                    return false;
                }
            }
                else if(c=='L'){
                    lat++;
                    if(lat>=3){
                        
                        return false;
                    }
                }else{
                    lat=0;//   'P'
                }
                
            }
            return true;
        }
        
    }