import java.util.*;

class leetcode_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) return result;
        
        // Sort the array to handle duplicates and enable two-pointer technique
        Arrays.sort(nums);
        
        // Iterate through the array, fixing the first number
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the fixed number
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            // Use two pointers: left starts after i, right starts at the end
            int left = i + 1;
            int right = nums.length - 1;
            int target = -nums[i]; // We need nums[left] + nums[right] = -nums[i]
            
            while (left < right) {
                int sum = nums[left] + nums[right];
                
                if (sum == target) {
                    // Found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for left pointer
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Skip duplicates for right pointer
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++;
                    right--;
                } else if (sum < target) {
                    // Sum is too small, move left pointer to increase sum
                    left++;
                } else {
                    // Sum is too large, move right pointer to decrease sum
                    right--;
                }
            }
        }
        
        return result;
    }
}