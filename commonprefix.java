class Solution {
    public String longestCommonPrefix(String[] strs) {  // array string
    //    StringBuilder result = new StringBuilder();
    //    Arrays.sort(strs);
    //    char[] first = strs[0].toCharArray();
    //    char[] last = strs[strs.length-1].toCharArray();
    //    for(int i =0; i<first.length;i++){
    //        if(first[i]!=last[i]) break;
    //        result.append(first[i]);
    //    } 
    //    return result.toString();
    Arrays.sort(strs);
    String s= "";
    for(int i =0; i<strs[0].length();i++){
        if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i)){
            break;
        }
        s = s + strs[0].charAt(i);
    }
    return s;
    }
}
//here they are two solutions one which has ben commented and another whch is the optimal solution the first one we have use the strigBuilder function and in the second 
// you are directly using the first array string to solve the string
