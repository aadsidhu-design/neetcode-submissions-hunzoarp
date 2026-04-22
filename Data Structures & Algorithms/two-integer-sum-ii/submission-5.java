class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length-1;
        int[] solution = new int[2];

        while(left<right){
            if(numbers[right]+numbers[left] == target){
                solution[0] = left+1;
                solution[1] = right+1;
                break;
            }
            if(numbers[right]+numbers[left] < target){
                left++;
            }
            if(numbers[right]+numbers[left] > target){
                right--;
            }
        }
        return solution;

    }
}
