class Solution {
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while(start<=end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else return palindromChecker(s, start+1, end) || palindromChecker(s, start, end-1);
        }
        return true;    
    }
    
    public boolean palindromChecker(String s,int start,int end){
        for(int i = start,j = end;i<=j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)) return false;
        }
        return true;
    }
}