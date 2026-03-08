class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store value and index
        Map<Integer, Integer> map = new HashMap<>();
        for ( int i = 0; i < nums.length; i++ ) {
            map.put(nums[i], i);
        }
        // Iterate through the array and check for complement
        for ( int j = 0; j < nums.length; j++ ) {
            int diff = target - nums[j]; // complement
            if ( map.containsKey(diff) && map.get(diff) != j ) {
                return new int[] { j, map.get(diff) };
            }
        }
        return null;
    }
}