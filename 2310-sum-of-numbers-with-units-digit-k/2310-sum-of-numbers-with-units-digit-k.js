/**
 * @param {number} num
 * @param {number} k
 * @return {number}
 */
var minimumNumbers = function(num, k) {
   if(num==0) return 0;
    for(let i = 1;i<=num;i++){
        if((i*k)%10==(num%10) && (i*k)<=num){
            return i;
        }
    }
    return -1;
};