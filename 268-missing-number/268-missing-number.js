/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let result = nums.length;
    for(let i = 0;i<nums.length;i++){
        result = result ^ i;
        result = result ^ nums[i];
    }
    return result;
};