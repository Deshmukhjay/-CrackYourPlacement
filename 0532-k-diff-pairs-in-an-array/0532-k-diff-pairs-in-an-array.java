class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
      int i=0,j=1,sum=Integer.MIN_VALUE;
      int count=0;
      while(j<nums.length&&i<nums.length-1){
        if(nums[j]-nums[i]==k&&(nums[i]+nums[j]!=sum)){
            sum=nums[i]+nums[j];
            count++;
            j++;
            i++;
        }
        else if(nums[j]-nums[i]<k){
            j++;
        }
        else{
            i++;
        }
        if(i==j)j++;
      }
        return count;
    }
}