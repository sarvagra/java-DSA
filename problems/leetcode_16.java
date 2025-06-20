import java.util.Arrays;

public class leetcode_16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);  // Sort the array
        int closest = nums[0] + nums[1] + nums[2];  // Initial guess

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currSum = nums[i] + nums[left] + nums[right];

                // If this sum is closer to target, update closest
                if (Math.abs(currSum - target) < Math.abs(closest - target)) {
                    closest = currSum;
                }

                // Move pointers based on sum comparison
                if (currSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closest;
    }
}
