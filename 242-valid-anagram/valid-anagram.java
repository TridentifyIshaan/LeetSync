class Solution {
    public boolean isAnagram(String s, String t) {
        if ( s.length() != t.length() ) {
            return false;
        }

        // Create New Hash Map
        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        // Count the frequency of each character in the first string by first converting the string to a character array and then iterating through it

        for ( char c : s.toCharArray() ) {
            countS.put(c, countS.getOrDefault(c, 0) + 1); // If the character is not present in the hash map, it will return 0 and then we add 1 to it. If it is present, it will return the current count and then we add 1 to it.
        }
        for ( char c : t.toCharArray() ) {
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }
        return countS.equals(countT); // T/F
    }
}