class Solution {
    public int longestConsecutive(int[] nums) {
    if(nums.length==0) return 0;
    HashSet<Integer> numberset = new HashSet<>();
    int count = 0; int longest = 1;
    for(int i = 0; i<nums.length;i++){
        numberset.add(nums[i]);
    }
    for(int it : numberset){
        if(!numberset.contains(it-1)){
             count = 1;
            int x = it;
        
            while(numberset.contains(x+1)){
                x = x+1;
                count++;
            }
        
            longest = Math.max(longest,count);
}
     
    }
       return longest;
    }
}
    // Arrays.sort(nums);
    // if(nums.length==0) return 0;
    // int count = 0; int leastnumber = Integer.MIN_VALUE;
    // int longest = 1;
    // for(int i = 0; i<nums.length;i++){
    //     if(nums[i]-1==leastnumber){
    //         count++;
    //         leastnumber = nums[i];
    //     }
    //     else if(nums[i]!=leastnumber){
    //         count = 1;
    //         leastnumber = nums[i];
    //     }
    //     longest = Math.max(count, longest);
    // }
    // return longest;




