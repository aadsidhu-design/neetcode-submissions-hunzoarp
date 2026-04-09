class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0){
            return 0;
        }
        int current = 1;
        int highest = 1;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i+1] - nums[i] == 1){
                current++;
                highest = Math.max(highest, current);
            } else if(nums[i+1] != nums[i]){
                current = 1;
            }
        }
        return highest;
    }
}
