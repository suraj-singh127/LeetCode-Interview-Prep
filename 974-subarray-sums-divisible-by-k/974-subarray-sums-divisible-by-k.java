class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;int currentSum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            currentSum = (currentSum + nums[i])%k;
            if(currentSum==0) count++;
            if(currentSum<0) currentSum=currentSum+k;
            if(map.containsKey((currentSum%k))){
                count = count + map.get(currentSum%k);
            }
            map.put(currentSum%k,map.getOrDefault(currentSum%k, 0) + 1);
        }
        return count;
    }
}