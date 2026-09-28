class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] stored1 = new int[256];
        int[] stored2 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            char l1 = t.charAt(i);

            
            if (stored1[s1] != stored2[l1]) {
                return false;
            }

           
            stored1[s1] = i + 1;
            stored2[l1] = i + 1;
        }

        return true;
    }
}