class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            int code = (int)(s.charAt(i));
            if(code>=65 && code<=90){
                code+=32;
                result.append((char)(code));
            }
            else if((code>=97 && code<=122) || (code>=48 && code<=57)){
                result.append((char)(code));
            }
        }
        System.out.println(result);
        for(int i = 0,j = result.length()-1;i<=j;i++,j--){
            if(result.charAt(i)!=result.charAt(j)) return false;
        }
        return true;
    }
}