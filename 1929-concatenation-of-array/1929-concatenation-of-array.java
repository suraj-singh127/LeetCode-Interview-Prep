class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] nums2 = new int[2*nums.length];
        for(int i = 0;i<nums.length;i++){
            nums2[i] = nums2[i+nums.length] = nums[i];
        }
        return nums2;
    }
}