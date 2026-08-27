class Solution {
    private List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res=new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates,target,0,new ArrayList<>(),0);
        return res;
        
    }

    private void dfs(int[] candi,int target,int i,List<Integer> curr,int total){
        if(total==target){
            res.add(new ArrayList<>(curr));
            return;
        }

        if(total>target || i==candi.length){
            return; 
        }
        curr.add(candi[i]);
        dfs(candi,target,i+1,curr,total+candi[i]);
        curr.remove(curr.size()-1);
        while(i+1<candi.length && candi[i]==candi[i+1]){
            i++;
        }
        dfs(candi,target,i+1,curr,total);
    }
}
