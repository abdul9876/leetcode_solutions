class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
 int sum = 0; 
 int max_sum = 0;
 for(int i = 0;i<nums.length;i++){
     if(nums[i]==0){
         sum=0;
     }
     sum += nums[i];
  max_sum = Math.max(max_sum,sum);    
 }

 return max_sum;
 
}}
