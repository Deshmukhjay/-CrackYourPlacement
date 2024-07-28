class Solution {
    public boolean validPalindrome(String s) {
   int i=0,j=s.length()-1;
   while(i<j){
    if(s.charAt(i)!=s.charAt(j)){
        return ispali(s,i+1,j)||ispali(s,i,j-1);
    }
    i++;
    j--;
   }
   return true;
    }

    private boolean ispali(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}