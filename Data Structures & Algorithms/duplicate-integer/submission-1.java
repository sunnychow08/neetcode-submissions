class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashMap<Integer,Integer> cd =new HashMap<>();
      for(int num : nums){
          cd.put(num,cd.getOrDefault(num,0)+1);
          if(cd.get(num)>1){
            return true;
          }
      }
      return false;
    }
}