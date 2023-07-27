class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character> mymap = new HashMap<>();
        for(int i = 0; i<s.length();i++){
            char first = s.charAt(i);
            char second = t.charAt(i);
            if(!mymap.containsKey(first)){
                if(!mymap.containsValue(second)){
                  mymap.put(first,second);
                }
                else return false;

            }
            else {
              char temp = mymap.get(first);
              if(temp!=second){
                  return false;
              }

            }


        }
        return true;
    }
}
