class Solution {
    public boolean isValid(String s) {
       HashMap<Character,Character>hmap=new HashMap<>();
       hmap.put(')','(');
       hmap.put(']','[');
       hmap.put('}','{');
       Stack<Character>st=new Stack<>();
   for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);
      if(hmap.containsValue(ch)){
        st.push(ch);}
        else if(hmap.containsKey(ch)){
            if(st.isEmpty()||st.pop()!=hmap.get(ch)){
                return false;
            
        }
      }
   }
   return st.isEmpty();

    }
}