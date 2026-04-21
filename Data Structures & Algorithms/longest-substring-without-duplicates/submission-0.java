class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];

        for(int i = 0; i<128; i++){
            arr[i] = -1;
        }

        int max = 0;
        int left = 0;

        for(int i = 0; i<s.length(); i++){
            char curr = s.charAt(i);
            //if we have seen it: since if we havent its -1, so if we have then it would be >0
            if(arr[curr] >= left){
                left = arr[curr]+1;
            }
            arr[curr] = i;

            max = Math.max(max, i-left +1);
        }
        return max;
    }
}
