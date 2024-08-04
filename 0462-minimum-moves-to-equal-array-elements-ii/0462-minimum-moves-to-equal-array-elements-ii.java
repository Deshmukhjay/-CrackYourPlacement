class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int val=(nums.length-1)/2;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=Math.abs(nums[val]-nums[i]);
        }
        return ans;
    }
}