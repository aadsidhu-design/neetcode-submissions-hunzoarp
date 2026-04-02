class Solution {
    public String mergeAlternately(String word1, String word2) {
        int times = Math.min(word1.length(), word2.length());

        StringBuilder sb = new StringBuilder();
        for(int i =0; i<times; i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if(word1.length() > word2.length()){
            sb.append(word1.substring(times));
        }else{
            sb.append(word2.substring(times));
        }
        return sb.toString();
    }
}