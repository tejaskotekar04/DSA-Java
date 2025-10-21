package arrays;

import java.util.Arrays;
public class divideArray {
    public boolean divide(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length; i+=2){
            if(nums[i]!=nums[i+1]){
                  return false;

            }
        }
        return true;
    }
    public static void main(String[] args){
        divideArray obj=new divideArray();
        int[] nums={3,2,3,2,2,2};
        obj.divide(nums);
          System.out.println(obj.divide(nums));

    }
}
