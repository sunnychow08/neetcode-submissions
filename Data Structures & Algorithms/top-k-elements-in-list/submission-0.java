class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer,Integer> res = new HashMap<>();
      for(int num : nums){
        res.put(num,res.getOrDefault(num,0)+1);
        
      }
      List<int[]> arr=new ArrayList<>();
      for(HashMap.Entry<Integer,Integer> entry : res.entrySet()){
        arr.add(new int[]{entry.getValue(),entry.getKey()});
      }
      arr.sort((a,b)->b[0]-a[0]);
      int[] count= new int[k];
      for(int i=0;i<k;i++){
         count[i]=arr.get(i)[1];
      }
      return count;
    }
}
