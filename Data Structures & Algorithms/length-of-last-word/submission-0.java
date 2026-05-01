class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int count = 2;
        for(int i = s.length()-1; i>=0; i--){
            if(length>1 && s.charAt(i) == ' '){
                    break;
                }
            if(s.charAt(i) != ' '){
                length += 1;
            }
        }
        return length;
    }
}