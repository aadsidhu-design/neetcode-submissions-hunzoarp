class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int highest = 0;
        int curr = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] ==1){
                curr +=1;
                highest = Math.max(curr, highest);
            }
            if(nums[i] == 0){
                curr = 0;
            }
        }
        return highest;

    }
}