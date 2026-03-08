class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> Map = new HashMap<>();
        for ( String s : strs) {
            int[] count = new int[26]; // Frequency array
            for ( char c : s.toCharArray() ) {
                count[c-'a']++; // Increment the counting index
            }
            String key = Arrays.toString(count); // Convert frequency array to string to use as a key
            Map.putIfAbsent(key, new ArrayList<>()); // If the key is not already in the map, create a new empty list for that key.
            Map.get(key).add(s); // Retrieve the list associated with the key and add the original string to it.
        }
        return new ArrayList<>(Map.values());
    }
}