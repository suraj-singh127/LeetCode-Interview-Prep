class Solution {
    public int countGoodSubstrings(String s) {
       int count = 0;
        for(int start = 0,end = 3;end <= s.length();start++,end++){
            if(checkGood(s, start, end)) ++count;
        }
        return count; 
    }
    
   public boolean checkGood(String s,int start,int end){
        HashSet<Character> set = new HashSet<>();
        for(int i = start;i<end;i++){
            if(set.contains(s.charAt(i))) return false;
            else set.add(s.charAt(i));
        }
        return true;
    }
}