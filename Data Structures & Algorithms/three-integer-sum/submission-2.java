class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int first = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<>();
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);

        
        for(int i = 0; i<sorted.length; i++){
            if(i > 0 && sorted[i] == sorted[i-1]){
                continue;
            }

            first = sorted[i];
            left = i+1;
            right = sorted.length-1;
            
            while(left < right){
                int sum = sorted[left] + sorted[right] + sorted[i];
                if(sum == 0){
                    result.add(Arrays.asList(sorted[i], sorted[left], sorted[right]));
                    while(left < right && sorted[left] == sorted[left+1]){
                        left++;
                    }
                    while(left < right && sorted[right] == sorted[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(sum > 0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return result;
    }
}
