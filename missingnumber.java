class Solution {
    public int missingNumber(int[] nums) {
    int n = nums.length;
    int t = n*(n+1)/2;
    for(int i = 0;i<nums.length;i++){
        t -= nums[i];
    }
        return t;
    }
}
