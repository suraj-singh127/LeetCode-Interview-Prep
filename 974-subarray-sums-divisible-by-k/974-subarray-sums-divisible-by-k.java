class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0; int sumRem = 0;
        int[] map = new int[k];
        for(int i = 0;i<nums.length;i++){
            sumRem = (sumRem+nums[i])%k;
            if(sumRem==0) count++;
            if(sumRem<0) sumRem+=k; 
            count = count + map[sumRem];
            map[sumRem]++;
        }
        return count;
    }
}