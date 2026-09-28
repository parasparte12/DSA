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

            // Compare the last seen position + 1 of both characters
            if (stored1[s1] != stored2[l1]) {
                return false;
            }

            // Update the last seen position (using i + 1 to distinguish from default 0)
            stored1[s1] = i + 1;
            stored2[l1] = i + 1;
        }

        return true;
    }
}