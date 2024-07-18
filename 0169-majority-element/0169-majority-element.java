class Solution {
    public int majorityElement(int[] nums) {
      int n =nums.length;
    HashMap<Integer,Integer> hmap=new HashMap<>();
    for(int i=0;i<n;i++){
        hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
    }
    n=n/2;
    for(Map.Entry<Integer,Integer>entry:hmap.entrySet()){
        if(entry.getValue()>n){
            return entry.getKey();
        }
    }
    return 0;
    }
}