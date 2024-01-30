class Solution {
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
    int low = 0, mid = 0, high = nums.length-1;
    while(mid<=high){
        int temp = 0;
        if(nums[mid]==0){
            swap(nums,low,mid);
             low++;
             mid++;
        }
        else if(nums[mid]==1){
           mid++;
        }
        else{
           swap(nums,mid,high);
             high--;
        }
    }


    //  int count0 = 0;
    //  int count1 = 0;
    //  int count2 = 0;
    //  for(int i =0; i<nums.length; i++){
    //      if(nums[i]==0) count0++;
    //      else if (nums[i]==1) count1++;
    //      else if(nums[i]==2) count2++;
    //  }                                                             /// better solution 
    //  for(int i =0; i<count0;i++) nums[i] = 0;
    //  for(int i =count0;i<count0+count1;i++) nums[i] =1;
    //  for(int i = count0+count1;i<nums.length;i++) nums[i] = 2;
     }
}
