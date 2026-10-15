class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int cnt=0;
        for(int i=0;i<n;i++){
            Set<Integer> look=new HashSet<>();
            for(int j=i;j<n;j++){
                look.add(nums.get(j));
                int diff=look.size();
                cnt+=diff*diff;

            }
        }
        return cnt;
        
    }
}