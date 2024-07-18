class Solution {
    public int subarraySum(int[] nums, int k) {
    HashMap<Integer,Integer>hmap=new HashMap<>();
   hmap.put(0,1);
   int cnt=0,prefix=0;
   for(int i=0;i<nums.length;i++){
    prefix+=nums[i];

    int remove=prefix-k;
    if(hmap.containsKey(remove)){
        cnt+=hmap.getOrDefault(remove,0);
    }
    hmap.put(prefix,hmap.getOrDefault(prefix,0)+1);
   }
   return cnt;
    }
}