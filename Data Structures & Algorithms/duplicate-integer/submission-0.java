class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        boolean solution = false;
        for(int i = 0; i<nums.length; i++){
            if(map.contains(nums[i])){
                solution = true;
            }
            map.add(nums[i]);
        }
        return solution;
    }
}