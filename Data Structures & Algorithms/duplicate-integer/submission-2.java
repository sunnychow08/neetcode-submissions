class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashSet<Integer> cd =new HashSet<>();
      for(int num : nums){
         if(cd.contains(num)){
            return true;
         }
         cd.add(num);
      }
      return false;
    }
}