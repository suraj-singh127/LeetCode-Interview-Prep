class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8) return false;
        String special = "!@#$%^&*()-+";
        char c;
        int[] countArray = new int[4];
        for(int i = 1;i<=password.length();i++){
            c = password.charAt(i-1);
            if(Character.isLowerCase(c)) countArray[0]++;
            if(Character.isUpperCase(c)) countArray[1]++;
            if(Character.isDigit(c)) countArray[2]++;
            if(isSpecial(special,c)) countArray[3]++;
            if(i<password.length() && c==password.charAt(i)) return false; 
        }

        for(int i = 0;i<countArray.length;i++){
            if(countArray[i]==0) return false;
        }
        return true;
    }
    
    public boolean isSpecial(String special,char c){
        for(int i = 0;i<special.length();i++){
            if(c==special.charAt(i)) return true;
        }
        return false;
    }
}