class Solution {
    public void moveZeroes(int[] nums) {
   ArrayList<Integer> temp = new ArrayList<>();
   for(int i = 0;i<nums.length;i++){
     if(nums[i]!=0){
       temp.add(nums[i]);
     }
   }
     int len = temp.size();
   for(int i = 0;i<len;i++){
     nums[i] = temp.get(i);
   }
 
   for(int i = len; i<nums.length;i++){
       nums[i] = 0;
   }
 

    }
} // brute force solution
