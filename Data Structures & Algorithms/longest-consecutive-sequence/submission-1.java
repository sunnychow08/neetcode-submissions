class Solution {
    public int longestConsecutive(int[] nums) {
    int res=0;
    HashSet<Integer> lcs= new HashSet<>();
    for(int n: nums){
        lcs.add(n);
    }
    for(int n: nums){
        int streak=0,curr=n;
        while(lcs.contains(curr)){
          streak++;
          curr++;
        }
        res=Math.max(res,streak);
    }
    return res;

    }
}
