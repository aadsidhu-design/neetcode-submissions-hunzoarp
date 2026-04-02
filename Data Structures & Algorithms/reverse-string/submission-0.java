class Solution {
    public void reverseString(char[] s) {
        Deque<Character> queue = new ArrayDeque<>();
        StringBuilder string = new StringBuilder();
        for(char c : s){
            queue.push(c);
        }
        for(int i = 0; i<s.length; i++){
            s[i] = queue.pop();
        }
    }
}