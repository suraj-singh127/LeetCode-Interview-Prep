class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length;i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);    
        }
        int maxFreq = 0,max = nums[0];
        for(int key : freq.keySet()){
            if(freq.get(key)>maxFreq){
                maxFreq = freq.get(key);
                max = key;
            } 
        }
        return max;
    }
}