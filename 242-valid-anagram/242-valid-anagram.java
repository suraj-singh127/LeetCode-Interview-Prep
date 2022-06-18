class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> freq1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> freq2 = new HashMap<Character,Integer>();
        for(int i = 0;i<s.length();i++){
            freq1.put(s.charAt(i), freq1.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i = 0;i<t.length();i++){
            freq2.put(t.charAt(i), freq2.getOrDefault(t.charAt(i), 0)+1);
        }

        int freq = 0;
        for(char c: freq1.keySet()){
            freq = freq1.get(c);
            if(freq2.containsKey(c)){
                if(freq == freq2.get(c)){
                    continue;
                }
                else return false;
            }else return false;
        }
        return true;
    }
}