class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] temp = new int[nums.length];
       
        
        int neg = 1;
        int pos = 0;
        
        for (int i = 0; i < nums.length; i++) {
        if(nums[i]>0){
            temp[pos] = nums[i];
            pos += 2;
         }
        else if(nums[i]<0){ 
        temp[neg] = nums[i];
        neg += 2;}
        }
        return temp;
    }
}

