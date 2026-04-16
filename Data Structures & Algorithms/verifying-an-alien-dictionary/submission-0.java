class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<order.length(); i++){
            map.put(order.charAt(i), i);
        }

        for(int i = 0; i<words.length-1; i++){
            if(!inCorrectOrder(words[i], words[i+1], map)){
                return false;
            }
        }
        return true;

    }

    public boolean inCorrectOrder(String w1, String w2, HashMap<Character, Integer> map){
        int len = Math.min(w1.length(), w2.length());
        for(int i = 0; i<len; i++){
            if(map.get(w1.charAt(i)) != map.get(w2.charAt(i))){
                return map.get(w1.charAt(i)) < map.get(w2.charAt(i));
            }
        }
        return w1.length() <= w2.length();
    }
}