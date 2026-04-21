class Solution {
    public int longestConsecutive(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>(nums.length);

        for (int n : nums) {
            list.add(n); 
        }

        Collections.sort(list);
        int greatest = 0;
        int curr = 0;
        if(nums.length == 0){
            return 0;
        }
        for(int i = 0; i<nums.length-1; i++){
            if(list.get(i+1) - list.get(i) == 1){
                curr += 1;
                if(curr > greatest){
                    greatest = curr;
                }
            }
            else if(list.get(i+1) == list.get(i)){

            } else{
                curr=0;
                }
            }
        return greatest+1;

    }
}
