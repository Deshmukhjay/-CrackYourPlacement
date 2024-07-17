class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>hmap=new HashMap<>();
        hmap.put('I',1);
        hmap.put('V',5);
        hmap.put('X',10);
        hmap.put('L',50);
        hmap.put('C',100);
        hmap.put('D',500);
        hmap.put('M',1000);

        int result=hmap.get(s.charAt(s.length()-1));

        for(int i=s.length()-2;i>=0;i--){
           if(hmap.get(s.charAt(i))<hmap.get(s.charAt(i+1))){
            result-=hmap.get(s.charAt(i));
           }
           else{ result+=hmap.get(s.charAt(i));}
        }
        return result;
    }
}