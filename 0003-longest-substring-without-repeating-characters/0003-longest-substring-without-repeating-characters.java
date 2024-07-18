class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashMap<Character,Integer>hmap=new HashMap<>();
      if(s.length()==0){
        return 0;
        
      }
      int i=0,j=0,ans=Integer.MIN_VALUE;
      while(j<s.length()){
     if(!hmap.containsKey(s.charAt(j))){
     ans=Math.max(ans,j-i+1);
     hmap.put(s.charAt(j),1);
      j++;
     }
     else
      {hmap.remove(s.charAt(i));
        i++;}
      }  
      return ans;
    }
}