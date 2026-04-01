class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] solution = new int[2];
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                solution[1] = i;
                solution[0] = map.get(target-nums[i]);
            }
            map.put(nums[i], i);
        }
        return solution;
    }
}
