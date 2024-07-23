class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer>hmap=new HashMap<>();
     List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ans.add(nums[i]);
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
     Collections.sort(ans,(a,b)->
     (hmap.get(a)==hmap.get(b))?b-a: hmap.get(a)-hmap.get(b)
     );
     return ans.stream().mapToInt(i->i).toArray();
    }
}