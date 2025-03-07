class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
       int missing = -1, repeated = -1;
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i=0; i<n;i++){
            for(int j =0; j<m;j++){
             freq.put(grid[i][j], freq.getOrDefault(grid[i][j],0)+1);
            }
        }
        for(int num = 1; num<= n*n; num++){
            if(!freq.containsKey(num)){
                missing = num;
            }
            else if(freq.get(num)==2){
                repeated = num;
            }
        }
    return new int[] {repeated, missing};
    }
}
