class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int n : stones){
            list.add(n);
        }

        while(list.size()>1){

            list.sort(Comparator.reverseOrder());
            int x = list.get(0);
            int y = list.get(1);

            if(x==y){
                list.remove(0);
                list.remove(0);
            }
            if(x!=y){
                list.remove(0);
                list.remove(0);
                list.add(x-y);
            }
        }
        if(list.isEmpty()){
            return 0;
        }else{
            return list.get(0);
        }
    }
}
