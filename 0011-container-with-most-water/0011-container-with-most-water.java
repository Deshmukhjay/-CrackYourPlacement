class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int i=0,j=height.length-1;
        while (i<j){
                int ans=Math.min(height[j],height[i])*(j-i);
                max=Math.max(ans,max);
            if(height[i]<height[j]){
                i++;
            }
          else  j--;
        }
        return max;
    }
}