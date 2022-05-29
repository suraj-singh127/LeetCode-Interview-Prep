class Solution {
    public boolean isHappy(int n) {
        int count = 0;
        while(count <= 10000){
            n = getSquareSum(n);
            if(n==1) return true;
            count++;
        }
        return false;  
    }
    
    public int getSquareSum(int number){
        int result = 0;
        while(number>0){
            result+=(number%10)*(number%10);
            number/=10;
        }
        return result;
    }
}