class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral=new ArrayList<>();
        if(matrix==null || matrix.length==0) return spiral;
        int top=0,bottom=matrix.length-1,left=0,right=matrix[0].length-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){ //l->r
                spiral.add(matrix[top][i]);
            }
            top++;
            for(int j=top;j<=bottom;j++){ //t->b
                spiral.add(matrix[j][right]);
            }
            right--;
            if(top<=bottom){ //r->l
                for(int k=right;k>=left;k--){
                    spiral.add(matrix[bottom][k]);
                }
                bottom--;

            }
            if(left<=right){ //b->t
                for(int l=bottom;l>=top;l--){
                    spiral.add(matrix[l][left]);
                }
                    left++;
                }
            }
            return spiral;
        
    }
}