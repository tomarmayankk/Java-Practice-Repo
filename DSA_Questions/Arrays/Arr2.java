package DSA_Questions.Arrays;

public class Arr2 {
    public static int maximum_subarray(int[] nums){
        int maxending = nums[0];
        int maxsofar = nums[0];
        for(int i = 0; i < nums.length; i++){

        maxending = Math.max(nums[i], maxending + nums[i]);
        maxsofar = Math.max(maxsofar, maxending);
        }
        return maxsofar;
    }
    public static void main(String[] args){
        int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maximum_subarray(nums);
        System.out.println("Maximum subarray sum: " + result);
    }
}
