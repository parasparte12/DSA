class Solution {
    public int maxLength(int[] nums) {
        int maxVal = 0, allLcm = 1;
        for (int x : nums) {
            maxVal = Math.max(maxVal, x);
            allLcm = lcm(allLcm, x);
        }
        int limit = allLcm * maxVal;
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int prod = 1, g = 0, l = 1;
            for (int j = i; j < n; j++) {
                prod *= nums[j];
                g = gcd(g, nums[j]);
                l = lcm(l, nums[j]);
                if (prod == g * l) {
                    ans = Math.max(ans, j - i + 1);
                }
                if (prod > limit) {
                    break;
                }
            }
        }
        return ans;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    private int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}