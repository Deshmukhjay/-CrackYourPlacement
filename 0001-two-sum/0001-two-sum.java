class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> hmap=new HashMap<>();
    int []ans=new int[2];
    for(int i=0;i<nums.length;i++){
        if(hmap.containsKey(target-nums[i])){
         ans[0]=hmap.get(target-nums[i]);
         ans[1]=i;
         return ans;
        }
        hmap.put(nums[i],i);
    }
return ans;
    }
}