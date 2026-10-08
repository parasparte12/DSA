class Solution {
    public int trap(int[] height) {
        int lp=0 ,rp=height.length-1 ,leftTall=0,rightTall=0,total=0;
        while(lp<rp){
            int leftBar=height[lp];
            int rightBar=height[rp];
            if(leftBar<rightBar){
                if(leftBar>=leftTall){
                    leftTall=leftBar;
                
            }else total+=leftTall-leftBar;
            lp++;
        }else{
            if(rightBar>=rightTall){
                rightTall=rightBar;
            }else total+=rightTall-rightBar;
            rp--;
        }
        }
        return total;
    }
}