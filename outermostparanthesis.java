class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder sn = new StringBuilder();
        boolean add = false;
        for(char ch: s.toCharArray()){
            if(ch == '(' ){
                  count++;      
            }
            else if(ch == ')'){
                count--;
            }
            if(ch=='('&&count==2){
                add = true;            }
        
        if(ch == ')'&&count==0){
            add = false;
        }
        if(add == true){
            sn.append(ch);
        }
        }
        return sn.toString();    
        }
}  // solution 1
// my solution
class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder sn = new StringBuilder();
     
        for(char ch: s.toCharArray()){
            if(ch == '(' ){
                  count++;      
            }
            else if(ch == ')'){
                count--;
            }
            if((ch == '('&&count>=2)||(ch==')'&&count >= 1)){
                sn.append(ch);
            }
          
        }
        return sn.toString();    
        }
}
