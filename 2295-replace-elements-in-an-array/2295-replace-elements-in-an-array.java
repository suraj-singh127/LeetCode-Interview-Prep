class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        int i = 0;
        HashMap<Integer,Integer> indexValue = new HashMap<>();
        for(i = 0;i<nums.length;i++){
            indexValue.put(nums[i],i);
        }
        for(i = 0;i<operations.length;i++){
            indexValue.put(operations[i][1],indexValue.get(operations[i][0]));
            nums[indexValue.get(operations[i][0])] = operations[i][1];
        }
        return nums;
    }
}