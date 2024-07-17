class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList <Integer> arr=new ArrayList<>();
        HashMap<Integer,Integer>hmap=new HashMap<>();

      for(int i=0;i<nums.length;i++){
        if(hmap.containsKey(nums[i])){
            arr.add(nums[i]);
        }
        hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
      }
      return arr;
     
    }
}