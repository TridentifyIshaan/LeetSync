class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create array of pairs (value, original index)
        int[][] pairs = new int[nums.length][2]; // rows as much as array's length ; 2 columns: [value, original_index]
        for ( int i = 0; i < nums.length; i++ ) {
            pairs[i][0] = nums[i];  // value
            pairs[i][1] = i;         // original index
        }
        
        // Sort by value - using Comparator to sort based on the first element of the pair (the value)
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));
        // a -> a[0] is a lambda expression that takes an array 'a' and returns the first element (the value) for comparison during sorting.
        
        int left = 0;
        int right = nums.length - 1;
        while ( left < right ) {
            int sum = pairs[left][0] + pairs[right][0];
            if ( sum == target ) {
                // Return original indices
                return new int[] { pairs[left][1], pairs[right][1] };
            } else if ( sum < target ) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }
}