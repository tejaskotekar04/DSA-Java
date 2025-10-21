package arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        //throw new IllegalArgumentException("No two sum solution found");
        return new int[] {};
    }
    
        public static void main(String[] args) {
            TwoSum obj = new TwoSum();
    
            // Example 1
            int[] nums1 = {2, 7, 11, 15};
            int target1 = 9;
            int[] result1 = obj.twoSum(nums1, target1);
            System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");
    
            // Example 2
            int[] nums2 = {3, 2, 4};
            int target2 = 6;
            int[] result2 = obj.twoSum(nums2, target2);
            System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]");
        
    }
}