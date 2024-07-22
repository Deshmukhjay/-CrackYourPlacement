class Solution {
    public List<List<Integer>> combine(int n, int k) {
      List<List<Integer>> ans=new ArrayList<>();
      solve(n, k,new ArrayList<>(),ans);
      return ans;  
    }
    public void solve(int n,int k,List<Integer>cur, List<List<Integer>>ans){
     if(k==0){
        ans.add(new ArrayList<>(cur));
        return ;
     }   
     if(n==0){
        return;
     }
     cur.add(n);
     solve(n-1,k-1,cur,ans);
     cur.remove(cur.size()-1);
     solve(n-1,k,cur,ans);

    }
}