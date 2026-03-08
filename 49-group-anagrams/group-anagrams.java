class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> Map = new HashMap<>();
        for ( String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            Map.putIfAbsent(key, new ArrayList<>()); // If the key is not already in the map, create a new empty list for that key.
            Map.get(key).add(s); // Retrieve the list associated with the key and add the original string to it.
        }
        return new ArrayList<>(Map.values());
    }
}