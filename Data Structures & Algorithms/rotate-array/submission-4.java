class Solution {
    public void rotate(int[] nums, int k) {
        List<Integer> temp = new ArrayList<>();
        k=k%nums.length;
        for(int i = nums.length-k; i<nums.length; i++){
            temp.add(nums[i]);
        }
        for(int i =0; i<nums.length-k; i++){
            temp.add(nums[i]);
        }
        for(int i = 0; i<nums.length; i++){
            nums[i] = temp.get(i);
        }
    }
}