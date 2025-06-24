class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> su = new ArrayList<>();
        for(int i = 0; i<(1<<nums.length); i++){
            List<Integer> subs = new ArrayList<>();
            for(int j = 0; j<nums.length;j++){
                if((i& (1<<j))!=0){
                    subs.add(nums[j]);
                }
            }
            su.add(subs);
        }
        return su;
    }
}
