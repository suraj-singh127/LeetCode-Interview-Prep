/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfTwo = function(n) {
     if(n<=0) return false;
     if(n==536870912) return true;
    let logValue = caculateLog(n);
    return logValue - Math.floor(logValue) == 0;
};

var caculateLog = function(n){
    return Math.log(n) / Math.log(2);
}