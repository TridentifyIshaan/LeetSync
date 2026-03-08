class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store value and index
        Map<Integer, Integer> map = new HashMap<>();
        // Consolidated the previous code into one loop (One Pass)
        for ( int i = 0; i < nums.length; i++ ) {
            int diff = target - nums[i]; // complement
            if ( map.containsKey(diff) && map.get(diff) != i ) {
                return new int[] { i, map.get(diff) };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}