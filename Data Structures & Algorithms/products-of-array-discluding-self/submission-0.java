class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] test = new int[nums.length];
        test[nums.length - 1] = 1;
        for(int i = nums.length-2; i>=0; i--){
            test[i] = test[i+1]*nums[i+1];
        }
        int pref = 1;

        for(int i =0; i<nums.length; i++){
            test[i] = pref*test[i];
            pref *= nums[i];
        }

        return test;

         
    }
}  
