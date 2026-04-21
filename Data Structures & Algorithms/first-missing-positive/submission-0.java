class Solution {
    public int firstMissingPositive(int[] nums) {
        

        HashSet<Integer> set = new HashSet<>();
        int count = 1;

        for(int num : nums){
            set.add(num);
        }

        while(set.contains(count)){
            count++;
        }
        return count;
    }
}