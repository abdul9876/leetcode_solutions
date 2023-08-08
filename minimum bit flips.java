class Solution {
    public int minBitFlips(int start, int goal) {
        start = start^goal;
        int count = 0;
        while(start>0){
            count += (start&1);
            start = start>>1; 
        }
        return count;
    }
}
