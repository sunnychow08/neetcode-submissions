class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashMap<Integer,Integer> cd =new HashMap<>();
      for(int i=0;i<nums.length;i++){
          cd.put(nums[i],cd.getOrDefault(nums[i],0)+1);
      }
      Set<Integer> keys = cd.keySet();
      for(int key : keys){
         if(cd.get(key)>1){
            return true;
         }
      }
      return false;
    }
}