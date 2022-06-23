class Solution {
    public int countGoodSubstrings(String s) {
       int count = 0;
        HashSet<Character> set = new HashSet<>();
        boolean flag = true;
        for(int start = 0,end = 3; end<=s.length();start++,end++){
            for(int i = start;i<end;i++){
                if(set.contains(s.charAt(i))){
                    flag = false;
                    break;
                }
                else set.add(s.charAt(i));
            }
            if(flag){
                count++;
            }
            else flag = true;
            set.clear();
        }
        return count;
    }
}