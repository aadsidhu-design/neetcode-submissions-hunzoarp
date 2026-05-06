class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int count = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        int prev = 0;
        int[] ans = new int[temperatures.length];
        for(int i = 0; i<temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                prev = stack.pop();
                ans[prev] = i-prev;
            }
            stack.push(i);
        }
        return ans;
    }
}
