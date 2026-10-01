class Solution {
    public int[] productExceptSelf(int[] nums) {
        int output[] = new int[nums.length];

        int forward = 1;
        for(int i = 0 ; i < nums.length ; i++){
            output[i] = forward;
            forward *= nums[i];
        }

        int backward = 1;
        for(int i = nums.length - 1 ; i >= 0 ; i--){
            output[i] *= backward;
            backward *= nums[i];
        }

        return output;
    }
}  
