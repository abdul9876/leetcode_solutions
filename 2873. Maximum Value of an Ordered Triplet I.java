class Solution {
    public long maximumTripletValue(int[] nums) {
      long result = 0;
      for(int i = 0; i<nums.length;i++){
        for(int j = i+1; j<nums.length-1; j++){
            for(int k = j+1; k<nums.length;k++){
            long ans = ((long)(nums[i] - nums[j])*nums[k]);
            result = Math.max(result,ans);
            }
        }
      }
      return result;  
    }
}
