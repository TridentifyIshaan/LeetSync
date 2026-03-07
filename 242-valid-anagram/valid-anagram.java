class Solution {
    public boolean isAnagram(String s, String t) {
        if ( s.length() != t.length() ) {
            return false;
        }

        int[] count = new int[26]; // Assuming only lowercase letters
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // Increment count for s
            count[t.charAt(i) - 'a']--; // Decrement count for t
        }

        for (int i : count) {
            if (i != 0) {
                return false; // If any count is not zero, they are not anagrams
            }
        }
        return true;
    }
}