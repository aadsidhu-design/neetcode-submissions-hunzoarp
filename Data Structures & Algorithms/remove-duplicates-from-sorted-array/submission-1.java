class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
                list.add(nums[i]);
            }
        }
        for(int i = 0; i<list.size(); i++){
            nums[i] = list.get(i);
        }
        return list.size();
    }
}