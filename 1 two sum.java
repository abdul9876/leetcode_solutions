class Solution {
    public int[] twoSum(int[] nums, int target) {
     Map<Integer, Integer> map = new HashMap<>();
     for(int i = 0; i<nums.length;i++){
         int a = nums[i];
         int more = target - a;
         if(map.containsKey(more)){
             return new int[]{map.get(more), i};
         }
         map.put(a,i);
     }
     return new int[]{-1,-1};
    }
} 
//      return new int[]{-1,-1};
//         // for(int i = 0; i<nums.length;i++){
//         //     for(int j= i+1;j<nums.length;j++){
//         //         if(nums[i]+nums[j]==target){       //brute force solution
//         //             return new int[]{i,j};
//         //         }
//         //     }
//         // }
     
    
// }
// // }
