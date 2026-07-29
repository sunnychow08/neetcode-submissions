class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer,Integer> res = new HashMap<>();
      List<Integer>[] freq = new List[nums.length+1];
      for(int i=0;i<freq.length;i++){
        freq[i]=new ArrayList<>();
      }
      for(int n: nums){
        res.put(n,res.getOrDefault(n,0)+1);
      }
      for(Map.Entry<Integer,Integer> entry : res.entrySet()){
        freq[entry.getValue()].add(entry.getKey());
      }
      int[] count= new int[k];
      int index=0;
      for(int i=freq.length-1;i>0 && index<k;i--){
          for(int n : freq[i]){
            count[index++]= n;
            if(index==k){
              return count;
            }
          }
      }
      return count;

    }
}
