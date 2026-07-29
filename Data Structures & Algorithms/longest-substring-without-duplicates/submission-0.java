class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chararray=s.toCharArray();
        int res=0;
        for(int i=0;i<chararray.length;i++){
            HashSet<Character> set= new HashSet<>();
            for(int j=i;j<chararray.length;j++){
                if(set.contains(chararray[j])){
                    break;
                }
                set.add(chararray[j]);
            }
            res=Math.max(res,set.size());
        }
        return res;

    }
}
