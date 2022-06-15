class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int c = 0;
        Arrays.sort(potions);

        //Binarily searching for the value that results in a pair value greater than success value
        while(c<spells.length){
            int l = 0,r = potions.length;

            while(l<r){
                int mid = (int)(Math.floor((l+r)/2));
                if((long)potions[mid]*spells[c]>=success){
                    r = mid;
                }
                else l = mid+1;
            }
            spells[c] = potions.length - l;
            c++;
        }
        return spells;
    }
}