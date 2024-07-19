class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>hmap=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
        }
        for (int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(hmap.containsKey(ch)&&hmap.get(ch)>0){
                hmap.put(ch,hmap.getOrDefault(ch,0)-1);
                
            }
            else {return false;}
        }
        return true;
    }
}