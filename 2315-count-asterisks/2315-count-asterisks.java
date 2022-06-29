class Solution {
    public int countAsterisks(String s) {
        boolean flag = false;
        int count = 0;char ch;
        for(int i = 0;i<s.length();i++){
            ch = s.charAt(i);
            if(ch=='|'){
               flag = !flag;  
            } 
            else{
                if(ch=='*' && flag==false) count++;
            }
        }
        return count;
    }
}