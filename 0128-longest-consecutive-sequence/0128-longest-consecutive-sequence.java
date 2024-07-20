class Solution {
    public int longestConsecutive(int[] nums) {
     HashMap<Integer,Integer>hmap=new HashMap<>();
     for(int i=0;i<nums.length;i++){
        hmap.put(nums[i],1);
     }
     int ans=0;   
     for(int i=0;i<nums.length;i++){
     if(hmap.containsKey(nums[i]-1)){
        continue;
     }
     else{
        int count=0;
        int current=nums[i];
        while(hmap.containsKey(current)){
            count++;
            current++;
            ans=Math.max(ans,count);
        }

     }
     }
     return ans;
    }
}