/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let freq = new Array(nums.length+1);
    for(let i = 0;i<nums.length;i++){
        let num = nums[i];
        freq[num] = 1 || ++freq[nums];
    }
    for(let i = 1;i<freq.length;i++){
        if(freq[i]===undefined) return i;
    }
    return 0;
};