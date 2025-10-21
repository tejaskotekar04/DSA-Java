package arrays;

public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
 
        int i = 0;
 
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
 
        return i + 1;
    }
    public static void main(String[] args) {
        RemoveDuplicate obj = new RemoveDuplicate();
        int[] nums = {1,1,1,2}; // Input array

        int length = obj.removeDuplicates(nums); // Call the method

        System.out.println("Output: " + length); // Print the new length
    }
}