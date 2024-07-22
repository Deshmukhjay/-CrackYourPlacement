import java.util.Collections;  
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=heights.length;
      HashMap<Integer,String>hmap=new HashMap<>();
      for(int i=0;i<heights.length;i++){
      hmap.put(heights[i],names[i]);
      }  
      Arrays.sort(heights);
        for (int i = 0; i < n / 2; ++i) {
            int temp = heights[i];
            heights[i] = heights[n - 1 - i];
            heights[n - 1 - i] = temp;
        }
      for(int i=0;i<heights.length;i++){
        names[i]=hmap.get(heights[i]);
      }
      return names;
    }
}