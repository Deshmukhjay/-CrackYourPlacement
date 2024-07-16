class Solution {
    public int subarraysDivByK(int[] nums, int k) {
     int ans=0;
     HashMap<Integer,Integer>hmap=new HashMap<>();
     hmap.put(0,1);
     int sum=0;
     int rem=0;

     for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        rem=sum%k;
        if(rem<0) rem+=k;
        
        if(hmap.containsKey(rem)){
            ans+=hmap.get(rem);
            hmap.put(rem,hmap.get(rem)+1);
        }
        else{
            hmap.put(rem,1);
        }
     }   
        return ans;
    }
}