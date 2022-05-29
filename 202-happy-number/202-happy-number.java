class Solution {
    public boolean isHappy(int n) {
        int x = n;
        int y = n;
        while(x > 1){
            x = getSquareSum(x);
            if(x == 1) return true;
            y = getSquareSum(getSquareSum(y));
            if(y == 1) return true;

            if(x==y) return false;
        }
        return true;  
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