class Solution {
    public boolean isPalindrome(String s) {
        String str= s.toLowerCase();
        int l=0,r=s.length()-1;
        while(l<r){
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            while(r>l && !Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
