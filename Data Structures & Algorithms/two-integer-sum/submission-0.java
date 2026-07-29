class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> x= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            x.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int diff= target-nums[i];
            if(x.containsKey(diff)&&x.get(diff)!=i){
                return new int[]{i,x.get(diff)};
            }
        }
        return new int[0];
    }
}
